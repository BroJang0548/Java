package com.brojang.java.ex08._class.getset;

public class CarEx {
    public static void main(String[] args) {

        Car car = new Car();

        car.setSpeed(50);
        System.out.println("speed: " + car.getSpeed());

        car.setSpeed(100);
        System.out.println("speed: " + car.getSpeed());

        //stop
        if(!car.isStop()){
            car.setStop(true);
            System.out.println("stop: " + car.isStop());
        }
        System.out.println("speed: " + car.getSpeed());
    }
}
