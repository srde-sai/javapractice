package com.srdesai;

public class BreakandContinue {
    public static void main(String[] args) {
        System.out.println("Break example:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Value of i: " + i);
        }

        System.out.println("\nContinue example:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Value of i: " + i);
        }
    }
}
