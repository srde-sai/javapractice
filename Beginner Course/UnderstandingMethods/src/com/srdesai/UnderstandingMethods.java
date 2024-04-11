package com.srdesai;

public class UnderstandingMethods {
    public static void main(String[] args) {
        greet();
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }

    public static void greet() {
        System.out.println("Hello, World!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
