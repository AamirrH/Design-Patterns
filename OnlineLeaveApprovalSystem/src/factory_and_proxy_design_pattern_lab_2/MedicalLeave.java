package factory_and_proxy_design_pattern_lab_2;

public class MedicalLeave extends LeaveRequest{

    @Override
    public void applyLeave() {
        System.out.println("Applying Medical Leave Request..." +
                "\nFor Reason: " + super.getReason() +
                "\nDays: " + super.getDays() +
                "\nApplier Name: " + super.getApplierName());
    }

}
