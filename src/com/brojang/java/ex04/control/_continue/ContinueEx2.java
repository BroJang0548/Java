package com.brojang.java.ex04.control._continue;

public class ContinueEx2 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }


    }
}
