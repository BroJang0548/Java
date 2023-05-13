package com.brojang.java.ex02.variable.type3;

public class StringTest2 {
    public static void main(String[] args) {
        // 문자열 간 연산은 결과도 문자열
        String name ="Ja" + "va";
        String str = name + 11;
        System.out.println(name);
        System.out.println(str);
        System.out.println(11 + " ");
        System.out.println(" "+ 11);
        System.out.println("" + "");
        System.out.println(11+11+"");
        System.out.println(""+11+11);
    }
}
