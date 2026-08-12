package abstract_factor_and_bridge_design_pattern;

public class HeadOfDepartment implements BaseLeaveApprover {

    private final BaseLeaveApprover higherApprover;

    public HeadOfDepartment(BaseLeaveApprover higherApprover) {
        this.higherApprover = higherApprover;
    }


    @Override
    public void approveLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays()<=2){
            System.out.println("Your"+ "("+leaveRequest.getApplierName()+")"+"leave has been approved by Head Of Department");
        }
        else{
            higherApprover.approveLeave(leaveRequest);
        }
    }





}

