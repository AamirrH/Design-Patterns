package singleton_and_chain_of_responsibility_lab_1;

public class Main {

    public static void main(String[] args) {
        // Single instance: both variables point to the same object.
        LeaveManagementSystem leaveManagementSystem1 = LeaveManagementSystem.getInstance();
        LeaveManagementSystem leaveManagementSystem2 = LeaveManagementSystem.getInstance();
        LeaveRequest leaveRequest1 = leaveManagementSystem1.createLeaveRequest("Aamir Hussain", 10);

        // Approval hierarchy.
        BaseLeaveApprover director = new Director();
        BaseLeaveApprover principal = new Principal(director);
        BaseLeaveApprover hod = new HeadOfDepartment(principal);

        leaveManagementSystem1.sendForApproval(leaveRequest1, hod);
    }
}
