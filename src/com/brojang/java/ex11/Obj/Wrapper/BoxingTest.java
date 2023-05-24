package com.brojang.java.ex11.Obj.Wrapper;

public class BoxingTest {
    public static void main(String[] args) {

        //Boxing
        /*
        * 원시 타입, 객체 타입이 존재하는데 JDK 5부터 자동 타입 변환이 이루어짐
        *
        * 원시 타입을 객체 타입으로 변환하는 것 : AutoBoxing
        * -> Null 값을 가질 수 있음
        *
        * 객체 타입을 원시타입으로 변환하는 것 : Unboxing
        *
        *
        */

        // Auto Boxing
        Integer i = 100;
        System.out.println("value : " + i.intValue());

        // 대입 되면 자동 Unboxing
        int value = i;
        System.out.println("value : " + value);

        // 연산 시에도 자동 unboxing

        int value2 = i + 10;
        System.out.println("value2 : " + value2);

    }

}
