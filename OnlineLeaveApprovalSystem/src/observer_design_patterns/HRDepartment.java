package observer_design_patterns;

public class HRDepartment implements Observer{

    @Override
    public void update(LeaveRequest leaveRequest) {
        System.out.println("HR Department notified: updating leave records for "
                + leaveRequest.getApplierName()
                + " with status " + leaveRequest.getStatus());
    }
}
