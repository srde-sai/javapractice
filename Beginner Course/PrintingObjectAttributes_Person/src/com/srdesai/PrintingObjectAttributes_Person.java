package com.srdesai;

import java.util.Scanner;

public class PrintingObjectAttributes_Person {
    String name;
    int age;

    public PrintingObjectAttributes_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        PrintingObjectAttributes_Person person = new PrintingObjectAttributes_Person("Kevin Reddy", 30);
        System.out.println("Name: " + person.name + ", Age: " + person.age);
    }
}
