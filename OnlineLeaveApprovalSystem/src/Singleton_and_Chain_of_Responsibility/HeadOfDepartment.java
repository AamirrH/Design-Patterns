package Singleton_and_Chain_of_Responsibility;

public class HeadOfDepartment implements BaseLeaveApprover {

    private final BaseLeaveApprover higherApprover;

    public HeadOfDepartment(BaseLeaveApprover higherApprover) {
        this.higherApprover = higherApprover;
    }


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeave_Days()<=2){
            System.out.println("Your"+ "("+leaveRequest.getName()+")"+"leave has been approved by Head Of Department");
        }
        else{
            higherApprover.approveLeave(leaveRequest);
        }
    }





}
