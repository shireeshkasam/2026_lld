package com.ishan.design_patterns.creational.singleton.variants;

/**
 * Enum Singleton is the safest way to implement Singleton in Java.
 * Why best
 * Thread-safe
 * Serialization-safe
 * Reflection-safe
 * Minimal code
 */

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton via Enum");
    }
}
