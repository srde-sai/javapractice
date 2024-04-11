package com.srdesai;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};



        System.out.println("\nSimple for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);


        System.out.println("Enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }


        }
    }
}
