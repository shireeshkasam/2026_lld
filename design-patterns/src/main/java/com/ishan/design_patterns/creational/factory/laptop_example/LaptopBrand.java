package com.ishan.design_patterns.creational.factory.laptop_example;

public enum LaptopBrand {
    HP("Hewlett-Packard"),
    DELL("Dell"),
    APPLE("Apple");

    private final String name;

    LaptopBrand(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
