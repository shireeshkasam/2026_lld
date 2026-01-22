package com.ishan.design_patterns.behavioural.mediator.chatapp;

public class MediatorPatternDemo {

    public static void main(String[] args) {

        // Mediator (WhatsApp server)
        ChatMediator chatServer = new ChatMediatorImpl();

        // Users
        User u1 = new User("User-1");
        User u2 = new User("User-2");
        User u3 = new User("User-3");
        User u4 = new User("User-4");

        // Clients (WhatsApp installed on phones)
        ChatClient c1 = new WhatsAppChatClient(chatServer);
        ChatClient c2 = new WhatsAppChatClient(chatServer);
        ChatClient c3 = new WhatsAppChatClient(chatServer);
        ChatClient c4 = new WhatsAppChatClient(chatServer);

        // Registration
        c1.register(u1);
        c2.register(u2);
        c3.register(u3);
        c4.register(u4);

        // Messaging
        c1.send("Hello everyone!");
        c2.send("Hey folks!");
    }
}
