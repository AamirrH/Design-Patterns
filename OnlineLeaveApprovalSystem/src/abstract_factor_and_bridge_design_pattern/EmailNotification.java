package abstract_factor_and_bridge_design_pattern;

public class EmailNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("Email sent to " + facultyName + ": " + message);
    }
}
