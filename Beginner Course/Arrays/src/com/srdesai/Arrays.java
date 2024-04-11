package com.srdesai;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};


        System.out.println("Forward order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        System.out.println("\nReverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
