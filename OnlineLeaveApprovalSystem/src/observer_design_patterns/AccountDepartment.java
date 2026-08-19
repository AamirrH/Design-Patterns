package observer_design_patterns;
import observer_design_patterns.LeaveRequest;

public class AccountDepartment implements Observer {


    @Override
    public void update(LeaveRequest leaveRequest) {
        System.out.println("Accounts Department notified: checking salary deduction for "
                + leaveRequest.getApplierName()
                + " for " + leaveRequest.getDays() + " day(s)");
    }



}
