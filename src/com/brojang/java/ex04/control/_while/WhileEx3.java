package com.brojang.java.ex04.control._while;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String userInput ="";

        System.out.print("> ");
        userInput = scanner.nextLine();

        while (!userInput.equals("q")) {
            System.out.println(userInput);
            System.out.print("> ");
            userInput = scanner.nextLine();
        }

        System.out.println();
        System.out.println("프로그램 종료");

    }
}
