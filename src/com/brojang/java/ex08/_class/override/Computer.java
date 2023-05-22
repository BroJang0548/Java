package com.brojang.java.ex08._class.override;

public class Computer extends Calculator {

    // method override
    @Override
    public int add(int a, int b) {
        System.out.println("Computer add method called");
        return a + b + 30;
    }
}
