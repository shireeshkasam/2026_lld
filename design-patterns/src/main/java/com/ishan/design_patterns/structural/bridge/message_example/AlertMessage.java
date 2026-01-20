package com.ishan.design_patterns.structural.bridge.message_example;

public class AlertMessage extends Message {
    public AlertMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    void send(String content) {
        sender.sendMessage("ALERT: " + content);
    }
}
