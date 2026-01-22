package com.ishan.design_patterns.behavioural.mediator.chatapp;

public class WhatsAppChatClient extends ChatClient {

    public WhatsAppChatClient(ChatMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(User sender, User receiver, String message) {
        System.out.println(
                "[" + sender.getName() + "] -> [" + receiver.getName() + "]: " + message
        );
    }
}
