package com.ishan.design_patterns.structural.bridge.car_example.abstraction;

import com.ishan.design_patterns.structural.bridge.car_example.implementation.Engine;

public abstract class Car {
    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void operate();
}