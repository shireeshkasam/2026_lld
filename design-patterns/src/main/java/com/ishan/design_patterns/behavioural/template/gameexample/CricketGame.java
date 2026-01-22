package com.ishan.design_patterns.behavioural.template.gameexample;

public class CricketGame extends Game {

    @Override
    protected void initialize() {
        System.out.println("Cricket game initialized.");
    }

    @Override
    protected void start() {
        System.out.println("Cricket match started.");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing cricket: Batting and Bowling.");
    }

    @Override
    protected void showScore() {
        System.out.println("Cricket score: 250/8");
    }

    @Override
    protected void end() {
        System.out.println("Cricket match ended.");
    }
}
