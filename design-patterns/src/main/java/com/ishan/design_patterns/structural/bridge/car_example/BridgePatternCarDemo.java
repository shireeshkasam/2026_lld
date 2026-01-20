package com.ishan.design_patterns.structural.bridge.car_example;

import com.ishan.design_patterns.structural.bridge.car_example.abstraction.*;
import com.ishan.design_patterns.structural.bridge.car_example.implementation.*;

public class BridgePatternCarDemo {
    public static void main(String[] args) {
        Car sedan = new Sedan(new PetrolEngine());
        Car suv = new SUV(new ElectricEngine());

        sedan.operate();
        suv.operate();
    }
}