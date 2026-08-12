package abstract_factor_and_bridge_design_pattern;

public class SmsNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("SMS sent to " + facultyName + ": " + message);
    }
}
