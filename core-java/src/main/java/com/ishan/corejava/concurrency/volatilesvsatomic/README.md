# Volatile vs Atomic in Java: Thread Safety Explained

## Overview

This document explains the differences between the `volatile` keyword and atomic classes in Java, focusing on visibility
and atomicity in multi-threaded environments. We will see practical code examples to demonstrate when each should be
used and their limitations.

---

## Key Concepts

- **Volatile Keyword:**
    - Ensures **visibility** of changes to variables across threads.
    - Each thread keeps a local cache of variables for performance. When a variable is declared volatile, reads/writes
      always access main memory, forcing all threads to see the latest value.
    - Does *not* guarantee atomicity for compound actions (e.g., incrementing an integer).
- **Typical Usage of Volatile:**
    - Used for flags or simple state indicators between threads.
    - **Example case**: two threads, one (writer) sets a flag to `true`; the other (reader) is busy-waiting until the
      flag becomes `true`.

## Example 1: Volatile Flag Use-Case

```java
class SharedObj {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public void printIfFlagTrue() {
        while (!flag) {
            // Busy wait until flag becomes true
        }
        System.out.println("Flag is true now!");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTrue();
            System.out.println("Writer thread made the flag true");
        });

        Thread readerThread = new Thread(() -> sharedObj.printIfFlagTrue());

        readerThread.start();
        writerThread.start();
    }
}
```

- Without `volatile`, the reader thread might not see the updated value due to caching.

---

## Limitations of Volatile

- When multiple threads perform *compound operations* (like incrementing a counter), volatile cannot ensure atomicity.
- Example: Incrementing a `volatile int` from two threads can yield incorrect (non-deterministic) results.

---

## Example 2: Volatile with Counter (Not Thread-Safe)

```java
class VolatileCounter {
    private volatile int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc = new VolatileCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) vc.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) vc.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Counter: " + vc.getCounter());
    }
}
```

- Expected result: `2000`, but usually prints less due to race conditions.

---

## Atomic Classes: Ensuring Atomicity

- **AtomicInteger, AtomicBoolean, AtomicLong, etc.**
    - Provided in `java.util.concurrent.atomic` package.
    - Offer atomic operations without explicit synchronization or locks.
    - Ideal for thread-safe incremental and compound operations.

## Example 3: AtomicInteger for Thread-Safe Counting

```java
import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter ac = new AtomicCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ac.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) ac.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Counter (Atomic): " + ac.getCounter());
    }
}
```

- Now the result will always be `2000`: thread safety and atomicity are guaranteed.

---

## Practical Guidelines

- Use `volatile` for simple *state change/notification flags* between threads.
- Use `Atomic` types or synchronization (locks, synchronized methods) for operations needing *atomicity*.
- Don't rely on `volatile` for compound actions—always use atomic classes or synchronization.

---

**Summary Table**

| Feature       | Volatile               | Atomic Classes             |
|---------------|------------------------|----------------------------|
| Visibility    | Yes                    | Yes                        |
| Atomicity     | No                     | Yes                        |
| Use Case      | Flags, state variables | Counters, compound updates |
| Thread-safe?  | Only for visibility    | Always                     |
| Locks Needed? | No                     | No                         |

---