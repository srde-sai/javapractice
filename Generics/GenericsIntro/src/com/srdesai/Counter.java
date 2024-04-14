package com.srdesai;

public class Counter <T>{
    T i;

     Counter(T i) {
        this.i = i;
    }

    public void print() {
        System.out.println(i);
    }
}

