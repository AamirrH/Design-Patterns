import Singleton_and_Chain_of_Responsibility.*;

void main() {

    // Single Instance, Both point to the same instance
    LeaveManagementSystem leaveManagementSystem1 = LeaveManagementSystem.getInstance();
    LeaveManagementSystem leaveManagementSystem2 = LeaveManagementSystem.getInstance();
    LeaveRequest leaveRequest1 = leaveManagementSystem1.createLeaveRequest("Aamir Hussain",10);

    // Hierarchy
    BaseLeaveApprover director = new Director();
    BaseLeaveApprover principal = new Principal(director);
    BaseLeaveApprover hod = new HeadOfDepartment(principal);

    leaveManagementSystem1.sendForApproval(leaveRequest1,hod);



}
