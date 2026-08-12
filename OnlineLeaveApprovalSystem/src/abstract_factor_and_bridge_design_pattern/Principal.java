package abstract_factor_and_bridge_design_pattern;

public class Principal implements BaseLeaveApprover {

    private final BaseLeaveApprover nextHigherApprover;

    public Principal(BaseLeaveApprover higherApprover) {
        this.nextHigherApprover = higherApprover;
    }


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {

        if (leaveRequest.getDays()>=2 && leaveRequest.getDays()<=7){
            System.out.println("Your "+ "("+leaveRequest.getApplierName()+")"+ "leave has been approved by Principal");
        }

        else{
            nextHigherApprover.approveLeave(leaveRequest);
        }

    }
}

