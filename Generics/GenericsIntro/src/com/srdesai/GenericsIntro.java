package com.srdesai;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsIntro {
    public static void main(String[] args) {
        IntegerCounter ab = new IntegerCounter(1);
        ab.print();

        DoubleCounter bc = new DoubleCounter(1.0);
        bc.print();

        Counter cd = new Counter<>("Hi");
        cd.print();

        ArrayList<Object> intList = new ArrayList<>();
        intList.add(2);
        intList.add("2");

        Integer i = (Integer) intList.get(0);
        System.out.println(i);

        genericMethod(9);


    }

    private static <T> T genericMethod(T t) {
        System.out.println(t + " is in generic method!");
        return  t;
    }

    private static void wildCard(List<?> list) {
        System.out.println(list);
    }
}

