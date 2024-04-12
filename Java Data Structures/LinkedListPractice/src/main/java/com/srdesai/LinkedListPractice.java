package com.srdesai;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Person> LinkedList = new LinkedList<>();
        LinkedList.add(new Person("Suhas", 21));
        LinkedList.add(new Person("Ravi", 34));
        LinkedList.addFirst(new Person("Sheetal", 15));
        ListIterator<Person> personListIterator = LinkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }

    static record Person(String name, Integer age) {}
}
