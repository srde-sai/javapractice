package com.srdesai;

import java.util.LinkedList;
import java.util.Queue;

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Queues {
    public static void main(String[] args) {
        Queue<Car> carQueue = new LinkedList<>();


        carQueue.add(new Car("Toyota Qualis", 2024));
        carQueue.add(new Car("Toyota Camry", 2022));
        carQueue.add(new Car("Honda Civic", 2019));
        carQueue.add(new Car("Ford Mustang", 2020));

        System.out.println("Size: " + carQueue.size());
        System.out.println("Peek: " + carQueue.peek().getModel() + " " + carQueue.peek().getYear());
        System.out.println("Remove: " + carQueue.remove().getModel() + " " + carQueue.peek().getYear());
        System.out.println("Poll: " + carQueue.poll().getModel() + " " + carQueue.poll().getYear());
        carQueue.forEach(car -> System.out.println(car.getModel() + " " + car.getYear()));


        System.out.println("Size: " + carQueue.size());
    }
}
