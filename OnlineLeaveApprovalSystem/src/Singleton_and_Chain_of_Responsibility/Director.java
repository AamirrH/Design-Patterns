package Singleton_and_Chain_of_Responsibility;

public class Director implements BaseLeaveApprover {

    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeave_Days()>7){
            System.out.println("Your "+ "("+leaveRequest.getName()+")"+" leave has been approved by Singleton_and_Chain_of_Responsibility.Director");
        }
        else if(leaveRequest.getLeave_Days()<7){
            System.out.println("Your"+ "("+leaveRequest.getName()+")"+" leave has been rejected by Singleton_and_Chain_of_Responsibility.Director");
        }
    }
}
