package com.brojang.java.ex08._class.override;

public class Car {
    // declare fields
    public int speed;

    // declare methods
    public void accelerate() {
        System.out.println("accelerating");
        speed++;
    }

    // declare final methods
    public final void brake() {
        System.out.println("braking");
        speed = 0;
    }
}
