package com.srdesai;

public class StringClass {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String combined = str1 + ", " + str2 + "!";
        int length = combined.length();
        String substring = combined.substring(0, 5);
        String uppercased = combined.toUpperCase();
        String lowercased = combined.toLowerCase();
        boolean isEqual = str1.equals(str2);

        System.out.println("Combined string: " + combined);
        System.out.println("Length of combined string: " + length);
        System.out.println("Substring of combined string: " + substring);
        System.out.println("Uppercase version: " + uppercased);
        System.out.println("Lowercase version: " + lowercased);
        System.out.println("Are str1 and str2 equal? " + isEqual);
    }
}
