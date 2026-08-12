package abstract_factor_and_bridge_design_pattern;

public class LeaveApprovalNotification extends LeaveNotification {

    public LeaveApprovalNotification(NotificationChannel notificationChannel) {
        super(notificationChannel);
    }

    @Override
    void notifyFaculty(LeaveRequest leaveRequest, String status) {
        String message = "Your leave request for " + leaveRequest.getDays()
                + " day(s) has been " + status
                + ". Reason: " + leaveRequest.getReason();

        notificationChannel.send(leaveRequest.getApplierName(), message);
    }
}
