package com.brojang.java.ex02.variable.type3;

public class IntTest {
    public static void main(String[] args) {
        int i1 = 100; // 10진수
        int i2 = 0123; // 8진수
        int i3 = 0xA; // 16진수
        int i4 = 0b101; // 2진수

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        // 이걸 printf로 하면?

        System.out.printf("%d\n",i1);
        System.out.printf("%#o\n",i2); // #가 붙고 안붙고의 차이
        System.out.printf("%#x\n",i3); // #의 경우 접두사 8진수 16진수 표기
        System.out.printf("%d\n",i4); // 이건 10진수
        System.out.printf("%d\n",Integer.toBinaryString(i4));

    }

}
