package com.srdesai;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashFunctions {

        public static void main(String[] args) {
            Map<Person, Diamond> map = new HashMap<>();

            map.put(new Person("Abc"), new Diamond("Indian"));

            System.out.println(new Person("Abc").hashCode());

            System.out.println(new Person("Abc").hashCode());

            System.out.println(map.get(new Person("Abc")));

        }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Anil"));
        map.put(2, new Person("Sunil"));
        map.put(3, new Person("Alexa"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(5));


        map.forEach((a, b) -> System.out.println(a)) ;
    }

    //record Person (String name, Integer age) {}
    static class Person {
    String Name;

        public Person(String name) {
            Name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "Name='" + Name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(Name, person.Name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(Name);
        }
    }

    record Diamond (String Name) {}
    }

