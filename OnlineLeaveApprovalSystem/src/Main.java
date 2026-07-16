

void main() {

    // Single Instance, Both point to the same instance
    LeaveManagementSystem leaveManagementSystem1 = LeaveManagementSystem.getInstance();
    LeaveManagementSystem leaveManagementSystem2 = LeaveManagementSystem.getInstance();
    LeaveRequest leaveRequest1 = leaveManagementSystem1.createLeaveRequest("Aamir Hussain",5);

    // Hierarchy
    BaseLeaveApprover director = new Director();
    BaseLeaveApprover principal = new Principal(director);
    BaseLeaveApprover hod = new HeadOfDepartment(principal);

    leaveManagementSystem1.sendForApproval(leaveRequest1,hod);



}
