import notification_channels.NotificationChannel;
import notification_types.NotificationType;

public class Notification {
    NotificationChannel channel;
    NotificationType type;

    Notification(NotificationChannel channel, NotificationType type) {
        this.channel = channel;
        this.type = type;
    }

    void sendNotification(String message) {
        String formatted = type.format(message);
        channel.send(formatted);
    }
}