package observer_design_patterns;

public abstract class LeaveNotification {

    protected NotificationChannel notificationChannel;

    public LeaveNotification(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    abstract void notifyFaculty(LeaveRequest leaveRequest, String status);
}
