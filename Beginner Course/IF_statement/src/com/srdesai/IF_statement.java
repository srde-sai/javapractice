package com.srdesai;

public class IF_statement {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        if (x > y) {
            System.out.println("x is greater than y");
        }

        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is not equal to y");
        }

        if (x < y) {
            System.out.println("x is less than y");
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
        }
}
