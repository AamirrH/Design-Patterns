package abstract_factor_and_bridge_design_pattern;

public class Director implements BaseLeaveApprover {

    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()>7){
            System.out.println("Your "+ "("+leaveRequest.getApplierName()+")"+" leave has been approved by Director");
        }
        else if(leaveRequest.getDays()<7){
            System.out.println("Your"+ "("+leaveRequest.getApplierName()+")"+" leave has been rejected by Director");
        }
    }
}

