package com.brojang.java.ex08._class.extendsClass;

public class Rectangle {

    private float area;

    public void printArea() {
        System.out.println("사각형 넓이 : " + area);
    }

    public void rectCalculator(float width, float height) {
        this.area = width * height;
    }
}
