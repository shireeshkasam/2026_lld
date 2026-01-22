package com.ishan.design_patterns.behavioural.mediator.chatapp;

public interface ChatMediator {

    void register(User user, ChatClient client);

    void broadcast(ChatClient sender, String message);
}
