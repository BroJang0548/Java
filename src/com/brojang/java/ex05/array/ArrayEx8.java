package com.brojang.java.ex05.array;

public class ArrayEx8 {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        // 객체는 참조하는 데이터
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);

        // strArray[0[과 strArray[2]는 false
        // strArray[2]는 new String으로 새 객체 생성
        // 결론적으로 strArray[0]과 strArray[2]는 서로 다른 객체를 참조
        // == 연산자의 경우 Primitive Type 일 경우 값 자체를 비교
        // 하지만  참조 데이터 유형일 경우 객체의 참조를 비교
        System.out.println(strArray[0] == strArray[2]);

        // 객체와 Primitive 타입 비교?
        int a = 2;
        Integer b = new Integer(2);
        if(a == b.intValue()){ // b의 값을 intValue 메서드로 객체 -> 기본 타입으로 변경
            System.out.println("같은 값");
        }else{
            System.out.println("다른 값");
        }

        System.out.println(strArray[0].equals(strArray[2]));



    }
}
