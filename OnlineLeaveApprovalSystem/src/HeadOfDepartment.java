public class HeadOfDepartment implements BaseLeaveApprover{

    private final BaseLeaveApprover higherApprover;

    public HeadOfDepartment(BaseLeaveApprover higherApprover) {
        this.higherApprover = higherApprover;
    }


    @Override
    public void approveLeave(int days) {
        if(days<=2){
            System.out.println("Your leave has been approved by HeadOfDepartment");
        }
        else{
            higherApprover.approveLeave(days);
        }
    }





}
