package com.brojang.java.ex08._class.extendsClass2;

public class Result {
    public static void main(String[] args) {

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
