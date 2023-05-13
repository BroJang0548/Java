package com.brojang.java.ex03.operator;

public class OpCompare2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;

        boolean result1 = (a==b) && (b==c);
        boolean result2 = (a==b) || (b==c);
        System.out.println(result1); // false
        System.out.println(result2); // true
    }
}
