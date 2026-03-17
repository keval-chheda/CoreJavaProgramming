package com.infra.string;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
//simplest way to reverse StringBuilder reverse method
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}

/**
 * using concatenation
 *
 *///public class ReverseString {
//    public static void main(String[] args) {
//        String input = "hello";
//        String reversed = "";
//
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);
//        }
//
//        System.out.println("Reversed String: " + reversed);
//    }
//}


/**
 * using charArray
 *
 *///public class ReverseString {
//    public static void main(String[] args) {
//        String input = "hello";
//        char[] arr = input.toCharArray();
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        System.out.println("Reversed String: " + new String(arr));
//    }
//}