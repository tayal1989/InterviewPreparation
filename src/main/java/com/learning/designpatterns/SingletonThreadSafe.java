package com.learning.designpatterns;

public class SingletonThreadSafe {

    private SingletonThreadSafe() {

    }

    private static SingletonThreadSafe singletonThreadSafe = null;

    public static SingletonThreadSafe getSingletonThreadSafe() {
        if(singletonThreadSafe == null) {
            synchronized (SingletonThreadSafe.class) {
                if(singletonThreadSafe == null) {
                    singletonThreadSafe = new SingletonThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }
}
