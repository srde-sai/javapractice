package com.srdesai;

public class WhileLoop {
    public static void main(String[] args) {
        // While loop
        int i = 0;
        System.out.println("While loop:");
        while (i < 5) {
            System.out.println("Value of i: " + i);
            i++;
        }


        int j = 0;
        System.out.println("\nDo-while loop:");
        do {
            System.out.println("Value of j: " + j);
            j++;
        } while (j < 5);
    }

    //While(true) {} -> Infinite loop

}
