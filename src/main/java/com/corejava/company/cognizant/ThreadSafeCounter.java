package com.corejava.company.cognizant;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demonstrates an atomic counter and safe visibility across worker threads.
 */
public final class ThreadSafeCounter {

    private final AtomicInteger value = new AtomicInteger();

    public int incrementAndGet() {
        return value.incrementAndGet();
    }

    public int get() {
        return value.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCounter counter = new ThreadSafeCounter();
        Thread first = new Thread(counter::incrementAndGet);
        Thread second = new Thread(counter::incrementAndGet);
        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("Counter value: " + counter.get());
    }
}
