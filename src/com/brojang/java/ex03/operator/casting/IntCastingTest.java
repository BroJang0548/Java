package com.brojang.java.ex03.operator.casting;

public class IntCastingTest {
    public static void main(String[] args) {
        double d= 100.2;
//        int score = d;
        int score = (int)d; // 강제 형변환
        System.out.println("결과 : "+score); // 100
        System.out.println("결과 : "+d); // 100.2
    }
}
