package com.ishan.design_patterns.structural.bridge.car_example.abstraction;

import com.ishan.design_patterns.structural.bridge.car_example.implementation.Engine;

public class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void operate() {
        System.out.println("SUV car operating with: ");
        engine.getConfiguration();
    }
}