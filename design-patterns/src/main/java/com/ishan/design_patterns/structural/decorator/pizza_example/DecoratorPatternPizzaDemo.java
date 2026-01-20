package com.ishan.design_patterns.structural.decorator.pizza_example;

public class DecoratorPatternPizzaDemo {

    public static void main(String[] args) {

        Pizza pizza = new VeggieTopping(new CheeseTopping(new MargheritaPizza()));
        System.out.println("Cost for Margherita Pizza with extra cheese and veggies:         " + pizza.cost());

        pizza = new CheeseTopping(new CheeseTopping(new VeggieTopping(new FarmHousePizza())));
        System.out.println("Cost for Farmhouse Pizza with double cheese and extra veggies:   " + pizza.cost());
    }
}
