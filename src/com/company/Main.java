package com.company;

public class Main {

    public static void main(String[] args) {

        Bisection b = new Bisection();

        System.out.println(b.bisection(-1, 5));
        System.out.println(b.getIteration());
    }
}
