package com.ishan.design_patterns.behavioural.mediator.chatapp;

public abstract class ChatClient {

    protected final ChatMediator mediator;
    protected User user;

    protected ChatClient(ChatMediator mediator) {
        this.mediator = mediator;
    }

    public void register(User user) {
        this.user = user;
        mediator.register(user, this);
    }

    public void send(String message) {
        mediator.broadcast(this, message);
    }

    public User getUser() {
        return user;
    }

    // Varies per client (console, mobile UI, web UI, etc.)
    public abstract void receive(User sender, User receiver, String message);
}
