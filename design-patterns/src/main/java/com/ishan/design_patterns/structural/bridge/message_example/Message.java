package com.ishan.design_patterns.structural.bridge.message_example;

public abstract class Message {
    protected MessageSender sender;

    protected Message(MessageSender sender) {
        this.sender = sender;
    }

    abstract void send(String content);
}
