package com.ishan.design_patterns.creational.factory.usecase.notification_example;

public class NotificationClient {

    public static void main(String[] args) {
        Notification notification =
                NotificationFactory.createNotification(
                        NotificationType.EMAIL,
                        "user@example.com",
                        "Hello!",
                        "noreply@example.com");

        notification.sendNotification();
    }
}
