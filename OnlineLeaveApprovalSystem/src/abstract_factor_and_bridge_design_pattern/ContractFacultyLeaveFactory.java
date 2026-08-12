package abstract_factor_and_bridge_design_pattern;

// Factory Which creates leaves only for Contract Faculty.
public class ContractFacultyLeaveFactory extends FacultyLeaveFactory{


    // Contract Faculty cannot create Medical Leave
    @Override
    LeaveRequest createMedicalLeave(String facultyName, int leaveDays, String reason) {
        System.out.println("Contract Faculty cannot create Medical Leave");
        return null;
    }

    @Override
    LeaveRequest createOnDutyLeave(String facultyName, int leaveDays, String reason) {
        return new ContractOnDutyLeave(leaveDays,facultyName,reason);
    }

    @Override
    LeaveRequest createCasualLeave(String facultyName, int leaveDays, String reason) {
        return new ContractCasualLeave(leaveDays,facultyName,reason);
    }
}
