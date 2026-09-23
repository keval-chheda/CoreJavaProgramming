package com.corejava.company.cognizant;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Demonstrates producer-consumer coordination with a bounded blocking queue.
 */
public final class ProducerConsumerQueue {

    private static final int POISON_PILL = -1;

    private ProducerConsumerQueue() {
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(() -> {
            try {
                for (int value = 1; value <= 5; value++) {
                    queue.put(value);
                }
                queue.put(POISON_PILL);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                int value;
                while ((value = queue.take()) != POISON_PILL) {
                    System.out.println("Consumed: " + value);
                }
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
