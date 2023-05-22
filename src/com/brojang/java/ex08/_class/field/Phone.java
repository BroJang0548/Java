package com.brojang.java.ex08._class.field;

public class Phone {
    // fields
    public String model;
    public String color;

    // constructors
    public Phone() {
        System.out.println("Phone constructor");
    }

    // get var constructors
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("var : Phone constructor");
    }
}
