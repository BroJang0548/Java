package com.brojang.java.ex02.variable.type3;

public class RealTest {
    public static void main(String[] args) {
        double d1 = 3.141592;
        // float는 구분을 위해 항상 리터럴에 f를 붙여야 한다.
        float f1 = 3.14f;

        //ex
//        float f2 = 3.1415; // f를 안붙였기 때문에 컴파일 에러
        float f2 = 3.141236781239617823961239f; // f를 붙여야 함 구분짓기 위함
//        float f2 = 3.15;
        double d2 = 3.141236781239617823961239; // d를 붙이지 않아도 됨

        System.out.println(f2);
        System.out.println(d2);

        double d3 = 3e1;
        System.out.println(d3);

        double d4 = 3e7;
        System.out.println(d4);
    }
}
