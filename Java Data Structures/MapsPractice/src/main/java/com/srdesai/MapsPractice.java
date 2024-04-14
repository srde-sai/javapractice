package com.srdesai;

import java.util.HashMap;
import java.util.Map;

public class MapsPractice {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Anil", 28));
        map.put(2, new Person("Sunil", 23));
        map.put(3, new Person("Alexa", 33));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(5));

    map.forEach((a, b) -> System.out.println(a + "" + b));


    }

    record Person (String name, Integer age) {}
}
