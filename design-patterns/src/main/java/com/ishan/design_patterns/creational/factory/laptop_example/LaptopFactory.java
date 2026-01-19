package com.ishan.design_patterns.creational.factory.laptop_example;

public class LaptopFactory {

    public static Laptop getLaptop(LaptopBrand brand) {
        if (brand == null) {
            throw new IllegalArgumentException("Brand name cannot be null");
        }

        switch (brand) {
            case HP:
                return new HPLaptop();
            case DELL:
                return new DellLaptop();
            case APPLE:
                return new AppleLaptop();
            default:
                throw new IllegalArgumentException("Unknown laptop brand: " + brand.getName());
        }
    }
}
