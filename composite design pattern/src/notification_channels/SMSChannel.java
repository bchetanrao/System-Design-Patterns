package notification_channels;

public class SMSChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: \n" + message);
    }
}