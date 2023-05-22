package com.brojang.java.ex05.array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 예외
        int [] intArr = {100,95,90,85,80};
        // 모든 요소를 [1번째 요소, 2번째 요소 등...] 형태의 문자열로 반환
        System.out.println(Arrays.toString(intArr));

        int [] intArr2 = {1,2,3,4,5};
        System.out.println(intArr2); // 타입@16진수 주소 배열 형식으로 출력

        char[] chArr = {'a','b','c','d'};
        System.out.println(chArr); // 왜 타입@주소 형태가 아닐까?
        // String 자체가 char[]를 업그레이드해서 만들어짐
        // char[] 내부에는 toString 메서드가 존재함
        // 다른 타입들은 toString으로 해서 출력
        // 오버라이딩


    }
}
