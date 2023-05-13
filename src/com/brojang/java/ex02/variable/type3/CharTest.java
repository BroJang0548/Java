package com.brojang.java.ex02.variable.type3;

public class CharTest {
    public static void main(String[] args) {
        // char 테스트
        // char : 문자형이나 내부적으로 유니코드 정수로 저장
        // 아스키코드를 기준으로 따라간다.

        char ch1 = 'a';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);
//        System.out.println((char)'\u0041'); // 이런식으로 직접 넣는 것도 가능
        char ch3 = '가';
        char ch4 = 44032;
        System.out.println(ch3);
        System.out.println(ch4);

    }
}
