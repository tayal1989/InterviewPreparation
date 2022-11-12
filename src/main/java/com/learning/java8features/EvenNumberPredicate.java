package com.learning.java8features;

import java.util.function.Predicate;

public class EvenNumberPredicate {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i % 2 == 0;

        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i + " is an even number : " + p1.test(i));
        }
    }
}
