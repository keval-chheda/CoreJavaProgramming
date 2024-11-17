package com.programmingKC.dsa.algorithm;

public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found
            }
        }
        return -1; // Target not found
    }
}
