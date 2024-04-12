package com.srdesai;

import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> immutableList = List.of(1, 2, 3, 4, 5, 6, 7);

        ///immutableList.add(8); // Eror thrown

        System.out.println("Size: " + immutableList.size());
        System.out.println("Contains 2: " + immutableList.contains(2));
        System.out.println("Contains 5: " + immutableList.contains(5));
        System.out.println("Index of 2: " + immutableList.indexOf(2));
        System.out.println("Is empty: " + immutableList.isEmpty());
        System.out.println("First element: " + immutableList.get(0));

        for (int element : immutableList) {
            System.out.println(element);
        }
    }
}
