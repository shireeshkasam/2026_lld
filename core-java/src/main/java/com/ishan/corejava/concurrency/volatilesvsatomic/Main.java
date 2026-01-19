package com.ishan.corejava.concurrency.volatilesvsatomic;

/**
 * Shared object accessed by multiple threads.
 * Demonstrates the use of the 'volatile' keyword for visibility guarantees.
 */
class SharedObj {

    /**
     * 'volatile' ensures that:
     * 1. Any write to 'flag' by one thread is immediately visible to other threads.
     * 2. Threads do NOT cache the value of 'flag' locally.
     * <p>
     * Without volatile:
     * - The reader thread may never observe 'flag' becoming true
     * due to CPU caching or compiler reordering.
     */
    private volatile boolean flag = false;

    /**
     * Writer method.
     * Sets the flag to true.
     * This write is guaranteed to be visible to all other threads.
     */
    public void setFlagTrue() {
        flag = true;
    }

    /**
     * Reader method.
     * Continuously checks the flag value.
     * <p>
     * This loop relies on 'volatile' to ensure that
     * the latest value of 'flag' is always read from main memory.
     */
    public void printIfFlagTrue() {
        while (!flag) {
            // Busy-wait loop (spin-wait)
            // Keeps checking until another thread updates the flag.
            // 'volatile' prevents infinite looping here.
        }

        System.out.println("Flag is true now!");
    }
}

public class Main {

    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();

        /**
         * Writer thread:
         * - Simulates some work using sleep
         * - Updates the shared volatile variable
         */
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulate delay / work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            sharedObj.setFlagTrue();
            System.out.println("Writer thread made the flag true");
        });

        /**
         * Reader thread:
         * - Waits until the flag becomes true
         * - Depends on volatile for visibility
         */
        Thread readerThread = new Thread(sharedObj::printIfFlagTrue);

        readerThread.start();
        writerThread.start();
    }
}

/**
 * ## Key Concepts
 * <p>
 * - **Volatile Keyword:**
 * - Ensures **visibility** of changes to variables across threads.
 * - Each thread keeps a local cache of variables for performance. When a variable is declared volatile, reads/writes always access main memory, forcing all threads to see the latest value.
 * - Does *not* guarantee atomicity for compound actions (e.g., incrementing an integer).
 * - **Typical Usage of Volatile:**
 * - Used for flags or simple state indicators between threads.
 * - **Example case**: two threads, one (writer) sets a flag to `true`; the other (reader) is busy-waiting until the flag becomes `true`.
 * <p>
 * ## Limitations of Volatile
 * <p>
 * - When multiple threads perform *compound operations* (like incrementing a counter), volatile cannot ensure atomicity.
 * - Example: Incrementing a `volatile int` from two threads can yield incorrect (non-deterministic) results.
 */