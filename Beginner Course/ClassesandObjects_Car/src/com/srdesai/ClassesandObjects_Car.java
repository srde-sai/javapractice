package com.srdesai;

public class ClassesandObjects_Car {
    String brand;
    String model;
    int year;

    public ClassesandObjects_Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving the " + year + " " + brand + " " + model);
    }

    public static void main(String[] args) {
        ClassesandObjects_Car myCar = new ClassesandObjects_Car("Porche", "911", 2024);
        myCar.drive();
    }
}
