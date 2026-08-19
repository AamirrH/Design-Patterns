package observer_design_patterns;

public class LeaveManagementSystem implements LeaveSystem {

    private static LeaveManagementSystem leaveManagementSystemInstance = null;
    private final LeaveRequestCreator leaveRequestCreator;

    private LeaveManagementSystem(){
        this.leaveRequestCreator = new ConcreteLeaveRequestCreator();
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

    @Override
    public void processLeave(String name, String leaveType) {
        LeaveRequest leaveRequest = leaveRequestCreator.createLeaveRequest(leaveType);

        if (leaveRequest == null) {
            System.out.println("Invalid leave type: " + leaveType);
            return;
        }

        leaveRequest.setApplierName(name);
        leaveRequest.setReason("Not specified");
        leaveRequest.setDays(1);
        leaveRequest.applyLeave();
    }









}

