package com.ishan.design_patterns.structural.decorator.pizza_example;

public class VeggieTopping extends Topping {

    public VeggieTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 50;
    }
}
