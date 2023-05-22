package com.brojang.java.ex03.operator;

public class OpCount2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j 후위연산 i : " + i + ", j : " + j);

        j = 0;

        j = ++i;
        System.out.println("j 전위연산 i : " + i + ", j : " + j);

    }
}
