package observer_design_patterns;

public abstract class LeaveRequest {

    private int id;
    private int days;
    private String applierName;
    private String reason;
    private String status;

    public LeaveRequest(int days, String applierName, String reason) {
        this.days = days;
        this.applierName = applierName;
        this.reason = reason;
        this.status = "PENDING";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void applyLeave();

}

