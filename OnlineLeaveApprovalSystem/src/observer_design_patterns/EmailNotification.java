package observer_design_patterns;

public class EmailNotification implements NotificationChannel {

    @Override
    public void send(String facultyName, String message) {
        System.out.println("Email sent to " + facultyName + ": " + message);
    }
}
