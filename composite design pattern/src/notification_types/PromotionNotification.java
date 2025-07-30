package notification_types;

public class PromotionNotification implements NotificationType {
    @Override
    public String format(String baseMessage) {
        return "PROMOTION: " + baseMessage;
    }
}
