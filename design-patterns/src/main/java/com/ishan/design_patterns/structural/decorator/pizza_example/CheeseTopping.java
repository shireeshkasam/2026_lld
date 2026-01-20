package com.ishan.design_patterns.structural.decorator.pizza_example;

public class CheeseTopping extends Topping {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 100;
    }
}
