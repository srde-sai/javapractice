package com.srdesai;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(a).forEach(System.out::println);
    }


}