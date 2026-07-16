public class Director implements BaseLeaveApprover{

    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeave_Days()>7){
            System.out.println("Your "+ "("+leaveRequest.getName()+")"+" leave has been approved by Director");
        }
        else if(leaveRequest.getLeave_Days()<7){
            System.out.println("Your"+ "("+leaveRequest.getName()+")"+" leave has been rejected by Director");
        }
    }
}
