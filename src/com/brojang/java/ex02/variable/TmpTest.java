package com.brojang.java.ex02.variable;

public class TmpTest {
    public static void main(String[] args) {
        // tmp

        int x = 10;
        int y = 20;
        int tmp = 0; // 값 교환을 위한 임시 저장

        System.out.println(" x: "+x + " y: "+y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x : "+ x + " y : "+ y);
    }
}
