package com.ishan.design_patterns.creational.singleton.variants;

import java.io.ObjectStreamException;
import java.io.Serializable;

// Bill Pugh Singleton / Initialization-on-demand holder idiom
// Leverages JVM class loading guarantees
// Inner static class is loaded only when referenced
// No explicit synchronization required

/**
 * JVM guarantees class initialization is atomic
 * SingletonHelper is loaded only once
 * Class loading is synchronized internally by JVM
 * No race condition is possible
 * Class loading + initialization in Java is synchronized by the JVM itself.
 * SingletonHelper is loaded only when SingletonHelper is first referenced at line - return SingletonHelper.INSTANCE;
 */
public final class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
