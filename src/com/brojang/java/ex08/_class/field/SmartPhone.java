package com.brojang.java.ex08._class.field;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
//        super();
        super(model, color);
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone constructor called");
    }
}
