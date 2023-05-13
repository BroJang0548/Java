package com.brojang.java.ex03.operator;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자 입력 > ");

        String input = sc.nextLine();

        ch = input.charAt(0);

        if('0'<= ch && ch <= '9'){
            System.out.println("입력한 문자는 숫자");
        }
        if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')){
            System.out.println("입력한 문자는 영문자");
        }
    }
}