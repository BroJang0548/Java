package com.brojang.java.ex08._class.field;

public class Car {
    // fields
    String model;
    int speed;

    //constructor
    Car(String model) {
        this.model = model; //insert fields (this 생략 불가)
    }

    //methods
    void setSpeed(int speed) {
        this.speed = speed; //insert fields (this 생략 불가)
    }

    //methods
    void run() {
        this.setSpeed(100);
        System.out.println(this.model + " 속도 : " + this.speed);
    }

}
