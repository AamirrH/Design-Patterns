package factory_and_proxy_design_pattern_lab_2;

public class ConcreteLeaveRequestCreator extends LeaveRequestCreator {


    @Override
    LeaveRequest createLeaveRequest(String leaveType) {
        if(leaveType.equalsIgnoreCase("Medical")){
            return new MedicalLeave();
        }
        else if(leaveType.equalsIgnoreCase("Casual")){
            return new CasualLeave();
        }
        else if(leaveType.equalsIgnoreCase("On-Duty")){
            return new OnDutyLeave();
        }
        else{
            return null;
        }
    }

}
