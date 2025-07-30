import notification_channels.EmailChannel;
import notification_channels.NotificationChannel;
import notification_channels.SMSChannel;
import notification_types.AlertNotification;
import notification_types.NotificationType;
import notification_types.PromotionNotification;


public class CompositePatternApp {
    public static void main(String[] args) throws Exception {
        NotificationChannel emailChannel = new EmailChannel();
        NotificationChannel smsChannel = new SMSChannel();

        NotificationType alertType = new AlertNotification();   
        NotificationType promotionType = new PromotionNotification();

        Notification notify1 = new Notification(smsChannel, alertType);
        Notification notify2 = new Notification(emailChannel, promotionType);

        notify1.sendNotification("Server is down!");
        notify2.sendNotification("This is a promotion message! 📣");

    }
}