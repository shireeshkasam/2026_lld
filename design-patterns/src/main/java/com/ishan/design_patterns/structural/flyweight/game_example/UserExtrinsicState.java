package com.ishan.design_patterns.structural.flyweight.game_example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;
}
