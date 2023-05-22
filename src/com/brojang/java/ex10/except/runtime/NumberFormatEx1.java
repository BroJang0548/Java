package com.brojang.java.ex10.except.runtime;

public class NumberFormatEx1 {
    public static void main(String[] args) {
        String data1 = "1234";
        String data2 = "abcd1234";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;

        System.out.println(value1 + " + " + value2 + " = " + result);
    }
}
