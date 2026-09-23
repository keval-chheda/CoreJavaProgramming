package com.corejava.company.cognizant;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Demonstrates submitting independent tasks to a fixed-size thread pool.
 */
public final class ConcurrentTaskExecutor {

    private ConcurrentTaskExecutor() {
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            List<Callable<Integer>> tasks = Arrays.asList(
                    () -> 20 + 22,
                    () -> 6 * 7);
            for (Future<Integer> result : executor.invokeAll(tasks)) {
                System.out.println("Task result: " + result.get());
            }
        } finally {
            executor.shutdown();
        }
    }
}
