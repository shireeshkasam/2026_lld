package com.ishan.design_patterns.structural.bridge.car_example.abstraction;

import com.ishan.design_patterns.structural.bridge.car_example.implementation.Engine;

public class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void operate() {
        System.out.println("Sedan car operating with: ");
        engine.getConfiguration();
    }
}