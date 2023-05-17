package com.brojang.java.ex08._class.extendsClass;

public class Result {
    public static void main(String[] args) {

        float area = 0;

        int width = 10;
        int height = 20;


        // Rectangle Area
        Rectangle rectangle = new Rectangle();

        rectangle.rectCalculator(width, height);
        rectangle.printArea();

        //Triangle Area
        Triangle triangle = new Triangle();

        triangle.triangleCalculator(width, height);
        triangle.printArea();

    }
}
