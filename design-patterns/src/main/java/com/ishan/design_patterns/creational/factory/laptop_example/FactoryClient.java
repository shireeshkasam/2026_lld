package com.ishan.design_patterns.creational.factory.laptop_example;

public class FactoryClient {

    public static void main(String[] args) {
        Laptop hp = LaptopFactory.getLaptop(LaptopBrand.HP);
        System.out.println(hp.getConfiguration());

        Laptop dell = LaptopFactory.getLaptop(LaptopBrand.DELL);
        System.out.println(dell.getConfiguration());

        Laptop apple = LaptopFactory.getLaptop(LaptopBrand.APPLE);
        System.out.println(apple.getConfiguration());
    }
}
