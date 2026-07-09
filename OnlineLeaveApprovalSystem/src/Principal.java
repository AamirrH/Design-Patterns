public class Principal implements BaseLeaveApprover{

    private final BaseLeaveApprover nextHigherApprover;

    public Principal(BaseLeaveApprover higherApprover) {
        this.nextHigherApprover = higherApprover;
    }


    @Override
    public void approveLeave(int days) {

        if (days>=2 && days<=7){
            System.out.println("Your leave has been approved by Principal");
        }

        else{
            nextHigherApprover.approveLeave(days);
        }

    }
}
