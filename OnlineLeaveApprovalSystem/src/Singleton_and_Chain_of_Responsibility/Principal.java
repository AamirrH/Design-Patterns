package Singleton_and_Chain_of_Responsibility;

public class Principal implements BaseLeaveApprover {

    private final BaseLeaveApprover nextHigherApprover;

    public Principal(BaseLeaveApprover higherApprover) {
        this.nextHigherApprover = higherApprover;
    }


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {

        if (leaveRequest.getLeave_Days()>=2 && leaveRequest.getLeave_Days()<=7){
            System.out.println("Your "+ "("+leaveRequest.getName()+")"+ "leave has been approved by Singleton_and_Chain_of_Responsibility.Principal");
        }

        else{
            nextHigherApprover.approveLeave(leaveRequest);
        }

    }
}
