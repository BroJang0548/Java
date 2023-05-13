package com.brojang.java.ex03.operator.casting;

public class RealTest {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.12345678;

        double d2 = (double)f;
        // 실수 타입에서 float 범위를 넘는 값을 float로 형변환할 경우
        // ±무한대 or ±0을 결과로 얻음
        System.out.printf("f : %20.18f\n",f);
        System.out.printf("d : %20.18f\n",d); 
        System.out.printf("d2 : %20.18f\n",d2);
//        System.out.printf("d2 : %20.18lf\n",d2); // lf는 없네
    }
}
