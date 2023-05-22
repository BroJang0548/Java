package com.brojang.java.ex03.operator.casting;

public class CharCastingTest {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'e';
        char ch3 = 'l';
        char ch4 = 'l';
        char ch5 = 'o';
        System.out.println(ch1); // h // 아스키 104
        System.out.println(ch2); // e // 아스키 101
        System.out.println(ch3); // l // 아스키 108
        System.out.println(ch4); // l
        System.out.println(ch5); // o // 아스키 111

        System.out.println(ch1 + ch2); // 205
        System.out.println(ch1 + ch2 + ch3 + ch4 + ch5); // 532
        System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4 + "" + ch5);
        System.out.println(ch1-32);
        System.out.println((char)(ch1-32)); // 대문자

    }
}
