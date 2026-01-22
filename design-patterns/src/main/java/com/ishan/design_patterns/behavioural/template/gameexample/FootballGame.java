package com.ishan.design_patterns.behavioural.template.gameexample;

public class FootballGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Football game initialized.");
    }

    @Override
    protected void start() {
        System.out.println("Football match started.");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing football: Passing and Shooting.");
    }

    // No score display → uses default hook behavior

    @Override
    protected void end() {
        System.out.println("Football match ended.");
    }
}
