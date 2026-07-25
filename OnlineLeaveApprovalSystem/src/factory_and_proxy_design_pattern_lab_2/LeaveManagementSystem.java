package factory_and_proxy_design_pattern_lab_2;

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



    public void sendForApproval(LeaveRequest leaveRequest, BaseLeaveApprover baseLeaveApprover){
        baseLeaveApprover.approveLeave(leaveRequest);

    }










}

