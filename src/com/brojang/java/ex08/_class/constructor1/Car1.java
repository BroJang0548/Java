package com.brojang.java.ex08._class.constructor1;

public class Car1 {
    // fields
    String company = "kia";
    String model = "";
    String color = "";
    int speed = 0;

    // constructor
    public Car1() {
    }

    // Overloading

    Car1(String model) {
        this.model = model;
    }

    Car1(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car1(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car1 car1 = new Car1("자가용");
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println();

        Car1 car2 = new Car1("자가용", "빨강");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car1 car3 = new Car1("택시", "검정", 200);
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.speed : " + car3.speed);
    }
}
