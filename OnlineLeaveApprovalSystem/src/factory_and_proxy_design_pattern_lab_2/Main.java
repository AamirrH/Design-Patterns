package factory_and_proxy_design_pattern_lab_2;

public class Main {

    public static void main(String[] args) {

        LeaveSystem leaveSystem = new LeaveManagementProxy("Aamir Hussain", "Aamir1");
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
    }
}
