package abstract_factor_and_bridge_design_pattern;

public class ConcreteLeaveRequestCreator extends LeaveRequestCreator {


    @Override
    LeaveRequest createLeaveRequest(String leaveType) {
        if(leaveType.equalsIgnoreCase("Medical")){
            return new PermanentMedicalLeave(1, "Not specified", "Not specified");
        }
        else if(leaveType.equalsIgnoreCase("Casual")){
            return new PermanentCasualLeave(1, "Not specified", "Not specified");
        }
        else if(leaveType.equalsIgnoreCase("On-Duty")){
            return new PermanentOnDutyLeave(1, "Not specified", "Not specified");
        }
        else{
            return null;
        }
    }

}
