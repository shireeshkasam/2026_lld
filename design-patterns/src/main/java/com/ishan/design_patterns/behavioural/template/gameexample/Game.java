package com.ishan.design_patterns.behavioural.template.gameexample;

public abstract class Game {

    // Template method
    public final void play() {
        System.out.println("Starting game flow...");
        initialize();
        start();
        playGame();
        showScore();   // hook
        end();
        System.out.println("Game flow completed.");
    }

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void playGame();

    protected abstract void end();

    // Hook method (optional)
    protected void showScore() {
        // default: do nothing
    }
}
