package abstract_factor_and_bridge_design_pattern;

public abstract class FacultyLeaveFactory {

    abstract LeaveRequest createMedicalLeave(String facultyName,int leaveDays,String reason);
    abstract LeaveRequest createOnDutyLeave(String facultyName,int leaveDays,String reason);
    abstract LeaveRequest createCasualLeave(String facultyName,int leaveDays,String reason);



}
