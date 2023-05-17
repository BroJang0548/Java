package com.brojang.java.ex08._class;

class Car {
    String model;
    boolean start;
    int speed;
}

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "HD";
        car.start = true;
        car.speed = 100;
        System.out.println(car.model);
        System.out.println(car.start);
        System.out.println(car.speed);
    }
}
