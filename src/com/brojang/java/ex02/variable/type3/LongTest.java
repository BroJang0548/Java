package com.brojang.java.ex02.variable.type3;

public class LongTest {
    public static void main(String[] args) {
        long l1 = 100;
        long l2 = 5000L;
        // L를 붙이지 않아 얘는 타입은 long 타입이나 데이터는 int가 들어감
        //long l3 = 1000000000000;     //컴파일 에러
        long l4 = 1000000000000L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l4);
    }
}
