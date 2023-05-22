package com.brojang.java.ex04.control._if;

import java.util.Scanner;

public class IfEx04 {
    public static void main(String[] args) {
        int score = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 > ");

        if (score >= 90) {
            System.out.println("A 등급");
        } else if (score >= 80) {
            System.out.println("B 등급");
        } else if (score >= 70) {
            System.out.println("C 등급");
        } else {
            System.out.println("D 등급");
        }

    }
}
