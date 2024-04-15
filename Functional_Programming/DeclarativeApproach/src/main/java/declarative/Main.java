package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static declarative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> ppl = List.of(
                new Person("Kiran", MALE),
                new Person("Neha", FEMALE),
                new Person("Sunil", MALE),
                new Person("Sneha", FEMALE),
                new Person("Subhash", MALE)
        );
        //declarative approach
        Predicate<Person> personPredicate = person -> MALE.equals(person.gender);


        List<Person> males2 = ppl.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
                males2.forEach(System.out::println);


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


