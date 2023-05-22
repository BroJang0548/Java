package com.brojang.java.ex10.except;

public class Exception01 {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        // ArithmeticException 예외 유발
        for (int i = 0; i < num; i++) {
            result = num / (int) (Math.random() * 10);
            System.out.println(result);
        }
    }
}
