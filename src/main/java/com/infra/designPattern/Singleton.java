package com.infra.designPattern;

public class Singleton {
    // Step 1: Create a private static instance of the class.
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation.
    private Singleton() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance of the class.
    public static Singleton getInstance() {
        if (instance == null) {
            // Lazy initialization - create the instance only when it is needed
            instance = new Singleton();
        }
        return instance;
    }
}

