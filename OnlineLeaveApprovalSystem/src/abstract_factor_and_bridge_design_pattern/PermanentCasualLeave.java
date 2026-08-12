package abstract_factor_and_bridge_design_pattern;

public class PermanentCasualLeave extends LeaveRequest {


    public PermanentCasualLeave(int days, String applierName, String reason) {
        super(days, applierName, reason);
    }

    @Override
    public void applyLeave() {
        System.out.println("Applying Casual Leave Request..." +
                "\nFor Reason: " + super.getReason() +
                "\nDays: " + super.getDays() +
                "\nApplier Name: " + super.getApplierName());
    }


}
