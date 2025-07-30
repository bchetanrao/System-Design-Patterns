package notification_types;

public class AlertNotification implements NotificationType {
    @Override
    public String format(String baseMessage) {
        return "ALERT: " + baseMessage;
    }
}
