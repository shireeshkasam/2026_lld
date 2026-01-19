package com.ishan.design_patterns.creational.factory.usecase.notification_example;

public abstract class Notification {

    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}