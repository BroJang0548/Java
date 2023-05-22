package com.brojang.java.ex03.operator;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");

        // 문자열 입력 : next()와 nextLine()
        // next() : 한줄 문자열(단, 공백이 생기면 그 전의 데이터까지만 읽어옴)
        // nextLine() : 개행 문자열(\n)을 토함해서 한줄 전체
        // nextLine으로 입력 받은 경우 버퍼가 차있을 경우가 있기 때문에
        // 항상 연달아 nextLine으로 입력 받을 경우 중간에 next()로 초기화를 해줘야한다.
        String input = sc.nextLine();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);
    }
}
