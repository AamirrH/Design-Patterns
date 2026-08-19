package observer_design_patterns;

public class SmsNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("SMS sent to " + facultyName + ": " + message);
    }
}
