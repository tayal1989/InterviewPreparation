package com.learning.designpatterns;

public class SingletonEagerWay {

    private static SingletonEagerWay singletonEagerWay = new SingletonEagerWay();

    public static SingletonEagerWay getSingletonEagerWay() {
        return singletonEagerWay;
    }
}
