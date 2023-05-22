package com.brojang.java.ex04.control._if;

public class IfEx03 {
    public static void main(String[] args) {
        int x = 0;

        if (x == 0) {
            System.out.println("x는 0이다");
        }

        if (x != 0) {
            System.out.println("x는 0이 아님");
        }

        if (!(x == 0)) {
            System.out.println("(x는 0이 아님)의 NOT");
        }

        if (!(x != 0)) {
            System.out.println("(x는 0이 아님)의 NOT");
        }

    }
}
