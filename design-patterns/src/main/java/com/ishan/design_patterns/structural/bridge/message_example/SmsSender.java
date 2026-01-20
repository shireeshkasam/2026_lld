package com.ishan.design_patterns.structural.bridge.message_example;

public class SmsSender implements MessageSender {
    public void sendMessage(String content) {
        System.out.println("Sending SMS -> " + content);
    }
}
