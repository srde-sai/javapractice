package com.srdesai;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        String result = (x >= y) ? "x is greater than y" : "x is less than or equal to y";
        System.out.println(result);

        int max = (x > y) ? x : y;
        System.out.println("Max value: " + max);
    }
}
