package com.ishan.design_patterns.behavioural.template.gameexample;

/**
 * Template Pattern = final workflow + abstract steps + optional hooks
 */

public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new CricketGame();
        game.play();

        System.out.println("================================");

        game = new FootballGame();
        game.play();
    }
}
