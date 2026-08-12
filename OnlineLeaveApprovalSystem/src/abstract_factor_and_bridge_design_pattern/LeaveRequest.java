package abstract_factor_and_bridge_design_pattern;

public abstract class LeaveRequest {

    private int days;
    private String applierName;
    private String reason;

    public LeaveRequest(int days, String applierName, String reason) {
        this.days = days;
        this.applierName = applierName;
        this.reason = reason;
    }

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

