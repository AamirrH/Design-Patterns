package abstract_factor_and_bridge_design_pattern;

public abstract class LeaveNotification {

    protected NotificationChannel notificationChannel;

    public LeaveNotification(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    abstract void notifyFaculty(LeaveRequest leaveRequest, String status);
}
