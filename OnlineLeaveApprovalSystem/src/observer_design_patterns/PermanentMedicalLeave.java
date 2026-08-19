package observer_design_patterns;

public class PermanentMedicalLeave extends LeaveRequest{

    public PermanentMedicalLeave(int days, String applierName, String reason) {
        super(days, applierName, reason);
    }

    @Override
    public void applyLeave() {
        System.out.println("Applying Medical Leave Request..." +
                "\nFor Reason: " + super.getReason() +
                "\nDays: " + super.getDays() +
                "\nApplier Name: " + super.getApplierName());
    }

}
