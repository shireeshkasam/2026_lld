package com.ishan.design_patterns.structural.bridge.message_example;

public class TextMessage extends Message {
    public TextMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    void send(String content) {
        sender.sendMessage("TEXT: " + content);
    }
}
