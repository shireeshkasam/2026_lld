package com.ishan.design_patterns.creational.singleton.variants;

/**
 * Problem
 * ❌ Breaks in multithreaded environments
 * Use only to explain why it fails.
 */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
