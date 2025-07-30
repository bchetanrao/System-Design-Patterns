package notification_channels;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending email: \n" + message);
    }
}
