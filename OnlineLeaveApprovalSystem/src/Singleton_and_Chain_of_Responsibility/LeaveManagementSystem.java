package Singleton_and_Chain_of_Responsibility;

public class LeaveManagementSystem {

    private static LeaveManagementSystem leaveManagementSystemInstance = null;

    private LeaveManagementSystem(){
    }

    public static LeaveManagementSystem getInstance(){
        if(leaveManagementSystemInstance==null){
            leaveManagementSystemInstance = new LeaveManagementSystem();
            return leaveManagementSystemInstance;
        }
        else{
            return leaveManagementSystemInstance;
        }
    }

    public LeaveRequest createLeaveRequest(String name, int days){
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setName(name);
        leaveRequest.setLeave_Days(days);
        return leaveRequest;

    }

    public void sendForApproval(LeaveRequest leaveRequest, BaseLeaveApprover baseLeaveApprover){
        baseLeaveApprover.approveLeave(leaveRequest);

    }










}
