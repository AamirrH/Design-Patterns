package abstract_factor_and_bridge_design_pattern;

public class Main {

    public static void main(String[] args) {

        LeaveSystem leaveSystem = new LeaveManagementProxy("Aamir Hussain", "Aamir123");
        leaveSystem.processLeave("Aamir Hussain", "Medical");

        // Leave Factory Creator
        LeaveRequestCreator leaveRequestCreator = new ConcreteLeaveRequestCreator();
        LeaveRequest leaveRequest1 = leaveRequestCreator.createLeaveRequest("Medical");
        leaveRequest1.setDays(12);
        leaveRequest1.setReason("Medical Issues");
        leaveRequest1.setApplierName("Aamir Hussain");
        leaveRequest1.applyLeave();


        // Approval hierarchy.
        BaseLeaveApprover director = new Director();
        BaseLeaveApprover principal = new Principal(director);
        BaseLeaveApprover hod = new HeadOfDepartment(principal);

        LeaveManagementSystem.getInstance().sendForApproval(leaveRequest1, hod);

        // Practical - 3
        FacultyLeaveFactory permanentFacultyLeaveFactory = new PermanentFacultyLeaveFactory();
        FacultyLeaveFactory contractFacultyLeaveFactory = new ContractFacultyLeaveFactory();

        LeaveRequest permanentCasualLeave = permanentFacultyLeaveFactory.createCasualLeave(
                "Aamir Hussain", 2, "Personal Work");
        LeaveRequest permanentMedicalLeave = permanentFacultyLeaveFactory.createMedicalLeave(
                "Aamir Hussain", 5, "Medical Issues");
        LeaveRequest permanentOnDutyLeave = permanentFacultyLeaveFactory.createOnDutyLeave(
                "Aamir Hussain", 3, "College Seminar");

        LeaveRequest contractCasualLeave = contractFacultyLeaveFactory.createCasualLeave(
                "Ali Khan", 1, "Family Function");
        LeaveRequest contractOnDutyLeave = contractFacultyLeaveFactory.createOnDutyLeave(
                "Ali Khan", 2, "Workshop Duty");

        permanentCasualLeave.applyLeave();
        permanentMedicalLeave.applyLeave();
        permanentOnDutyLeave.applyLeave();
        contractCasualLeave.applyLeave();
        contractOnDutyLeave.applyLeave();

        LeaveNotification emailNotification = new LeaveApprovalNotification(new EmailNotification());
        LeaveNotification smsNotification = new LeaveApprovalNotification(new SmsNotification());
        LeaveNotification mobileAppNotification = new LeaveApprovalNotification(new MobileAppNotification());

        emailNotification.notifyFaculty(permanentCasualLeave, "approved");
        smsNotification.notifyFaculty(permanentMedicalLeave, "approved");
        mobileAppNotification.notifyFaculty(contractOnDutyLeave, "approved");




    }
}
