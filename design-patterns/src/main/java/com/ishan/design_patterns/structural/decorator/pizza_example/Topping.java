package com.ishan.design_patterns.structural.decorator.pizza_example;

public abstract class Topping extends Pizza {
    protected Pizza pizza;

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }
}
