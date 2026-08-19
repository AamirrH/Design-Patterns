package observer_design_patterns;

public class MobileAppNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("Mobile App notification sent to " + facultyName + ": " + message);
    }
}
