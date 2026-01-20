package com.ishan.design_patterns.structural.bridge.car_example.implementation;

public class PetrolEngine implements Engine {
    @Override
    public void getConfiguration() {
        System.out.println("This is petrol engine!");
    }
} 