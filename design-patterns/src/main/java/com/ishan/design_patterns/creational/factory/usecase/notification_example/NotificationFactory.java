package com.ishan.design_patterns.creational.factory.usecase.notification_example;

public class NotificationFactory {

    public static Notification createNotification(NotificationType notificationType, String recipient, String message, String sender) {
        if (notificationType == null) {
            throw new IllegalArgumentException("Notification type cannot be null");
        }

        return switch (notificationType) {
            case EMAIL -> new EmailNotification(recipient, sender, message);
            case SMS -> new SmsNotification(recipient, message);
            case PUSH -> new PushNotification(recipient, message);
            default -> throw new IllegalArgumentException("Invalid notification type: " + notificationType);
        };
    }
}