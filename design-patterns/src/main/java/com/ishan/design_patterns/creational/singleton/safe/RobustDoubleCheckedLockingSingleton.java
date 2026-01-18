package com.ishan.design_patterns.creational.singleton.safe;

import java.io.ObjectStreamException;
import java.io.Serializable;

public final class RobustDoubleCheckedLockingSingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    // 1️⃣ volatile → required for correct double-checked locking
    private static volatile RobustDoubleCheckedLockingSingleton instance;

    // 2️⃣ Guard flag to prevent reflection
    private static boolean instanceCreated = false;

    private RobustDoubleCheckedLockingSingleton() {
        // Prevent reflection attack
        if (instanceCreated) {
            throw new RuntimeException("Use getInstance() method");
        }
        instanceCreated = true;
    }

    // 3️⃣ Thread-safe lazy initialization
    public static RobustDoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (RobustDoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new RobustDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    // 4️⃣ Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }

    /**
     * Make cloning to be idempotent, preserve backward compatibility
     * prefer graceful recovery to strict enforcement
     */
//    @Override
//    protected Object clone() {
//        return getInstance();
//    }

    // 5️⃣ Prevent serialization break
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}
