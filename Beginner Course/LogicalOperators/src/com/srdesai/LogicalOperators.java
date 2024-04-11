package com.srdesai;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        boolean resultAND = condition1 && condition2;
        System.out.println("Result of condition1 && condition2: " + resultAND);

        boolean resultOR = condition1 || condition2;
        System.out.println("Result of condition1 || condition2: " + resultOR);

        boolean resultNOT1 = !condition1;
        boolean resultNOT2 = !condition2;
        System.out.println("Result of !condition1: " + resultNOT1);
        System.out.println("Result of !condition2: " + resultNOT2);
    }
}

