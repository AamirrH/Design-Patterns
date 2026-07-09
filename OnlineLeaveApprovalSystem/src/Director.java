public class Director implements BaseLeaveApprover{

    @Override
    public void approveLeave(int days) {
        if(days>7){
            System.out.println("Your leave has been approved by Director");
        }
        else{
            System.out.println("Your leave has been rejected by Director");
        }
    }
}
