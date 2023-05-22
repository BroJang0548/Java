package com.brojang.java.ex08._class.extendsClass;

import java.awt.*;

public class Triangle  {

    // area
    private float area;

    // area result
    public void printArea() {
        System.out.println("삼각형 넓이 : " + area);
    }

    public void triangleCalculator(float width, float height) {
        this.area = width * height / 2.0f;
    }

}
