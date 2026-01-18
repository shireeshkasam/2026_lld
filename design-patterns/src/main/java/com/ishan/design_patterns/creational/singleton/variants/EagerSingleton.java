package com.ishan.design_patterns.creational.singleton.variants;

/**
 * Pros -
 * Simple
 * Thread-safe by default
 * Cons -
 * Instance created even if never used
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
