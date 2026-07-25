package factory_and_proxy_design_pattern_lab_2;

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

