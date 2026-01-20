package com.ishan.design_patterns.structural.bridge.message_example;

public class BridgePatternMessageDemo {
    public static void main(String[] args) {
        Message msg1 = new TextMessage(new SmsSender());
        Message msg2 = new AlertMessage(new EmailSender());

        msg1.send("Your OTP is 1234");
        msg2.send("CPU usage exceeded threshold");
    }
}
