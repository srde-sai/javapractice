package Imperative;

import java.util.ArrayList;
import java.util.List;

import static Imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> ppl = List.of(
            new Person("Anil", MALE),
            new Person("Aishwarya", FEMALE),
            new Person("Sunil", MALE),
                new Person("Aishwarya1", FEMALE),
                new Person("Suhas", MALE)
        );

        //imperative approach

        List<Person> females = new ArrayList<>();

        for (Person p: ppl) {
            if(FEMALE.equals(p.gender)) {
                females.add(p);
            }
        }

        List<Person> males = new ArrayList<>();

        for (Person p: ppl) {
            if(MALE.equals(p.gender)) {
                males.add(p);
            }
        }

        males.forEach((a) -> System.out.println(a));


    }




    static class Person {
        private final String Name;
        private final Gender gender;

         Person(String name, Gender gender) {
            this.Name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "Name='" + Name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}

