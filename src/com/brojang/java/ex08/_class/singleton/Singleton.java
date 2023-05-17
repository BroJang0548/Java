package com.brojang.java.ex08._class.singleton;

public class Singleton {
    // private field
    private static Singleton singleton = new Singleton();

    // private constructor
    private Singleton() {}

    // public method
    public static Singleton getInstance() {
        return singleton;
    }
}
