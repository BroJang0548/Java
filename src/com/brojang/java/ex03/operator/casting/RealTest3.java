package com.brojang.java.ex03.operator.casting;

public class RealTest3 {
    public static void main(String[] args) {
        float f = 10f; // f가 안붙으면 double로 해석
        int i = 3;
        System.out.println(f/i);

        // 연산자와 타입
        int i1 = 1;
        int i2= 2;
        double result = i1/i2;
        System.out.println(result);
        System.out.println((double)result);
        System.out.println((double)i1/i2);
        System.out.println(i1/(double)i2);
        System.out.println((double)(i1/i2)); // 연산 우선 -> 정수 결과 -> double 타입 변환
    }
}
