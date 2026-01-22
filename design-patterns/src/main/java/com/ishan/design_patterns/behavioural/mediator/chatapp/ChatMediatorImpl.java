package com.ishan.design_patterns.behavioural.mediator.chatapp;

import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {

    private final Map<User, ChatClient> users = new HashMap<>();

    @Override
    public void register(User user, ChatClient client) {
        users.put(user, client);
    }

    @Override
    public void broadcast(ChatClient sender, String message) {
        for (Map.Entry<User, ChatClient> entry : users.entrySet()) {
            if (entry.getValue() != sender) {
                entry.getValue().receive(sender.getUser(), entry.getKey(), message);
            }
        }
        System.out.println("--------------------------------------");
    }
}
