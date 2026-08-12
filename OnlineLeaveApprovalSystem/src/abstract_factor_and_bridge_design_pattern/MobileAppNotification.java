package abstract_factor_and_bridge_design_pattern;

public class MobileAppNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("Mobile App notification sent to " + facultyName + ": " + message);
    }
}
