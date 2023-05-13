package com.brojang.java.ex05.array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 예외
        int [] intArr = {100,95,90,85,80};
        // 모든 요소를 [1번째 요소, 2번째 요소 등...] 형태의 문자열로 반환
        System.out.println(Arrays.toString(intArr));

        int [] intArr2 = {1,2,3,4,5};
        System.out.println(intArr2);
    }
}
