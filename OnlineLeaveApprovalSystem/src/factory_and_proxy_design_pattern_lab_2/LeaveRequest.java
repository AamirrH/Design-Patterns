package factory_and_proxy_design_pattern_lab_2;

public abstract class LeaveRequest {

    private int days;
    private String applierName;
    private String reason;

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getApplierName() {
        return this.applierName;
    }

    public void setApplierName(String applierName) {
        this.applierName = applierName;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public abstract void applyLeave();

}

