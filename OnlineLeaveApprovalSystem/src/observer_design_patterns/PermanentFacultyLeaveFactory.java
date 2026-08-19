package observer_design_patterns;

public class PermanentFacultyLeaveFactory extends FacultyLeaveFactory{


    @Override
    LeaveRequest createMedicalLeave(String facultyName, int leaveDays, String reason) {
        return new PermanentMedicalLeave(leaveDays, facultyName, reason);
    }

    @Override
    LeaveRequest createOnDutyLeave(String facultyName, int leaveDays, String reason) {
        return new PermanentOnDutyLeave(leaveDays, facultyName, reason);
    }

    @Override
    LeaveRequest createCasualLeave(String facultyName, int leaveDays, String reason) {
        return new PermanentCasualLeave(leaveDays, facultyName, reason);
    }
}
