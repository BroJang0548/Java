package com.brojang.java.ex08._class.override;

public class DrivingCar extends Car {
    @Override
    public void accelerate() {
        System.out.println("Driving Car");
        speed+=10;
    }

    // disable override
    // brake method is final
    /*
    @Override
    public void brake() {
        System.out.println("Driving Car");
        speed-=10;
    }

     */
}
