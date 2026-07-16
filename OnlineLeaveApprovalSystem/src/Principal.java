public class Principal implements BaseLeaveApprover{

    private final BaseLeaveApprover nextHigherApprover;

    public Principal(BaseLeaveApprover higherApprover) {
        this.nextHigherApprover = higherApprover;
    }


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {

        if (leaveRequest.getLeave_Days()>=2 && leaveRequest.getLeave_Days()<=7){
            System.out.println("Your "+ "("+leaveRequest.getName()+")"+ "leave has been approved by Principal");
        }

        else{
            nextHigherApprover.approveLeave(leaveRequest);
        }

    }
}
