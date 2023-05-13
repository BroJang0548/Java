package com.brojang.java.ex04.control._dowhile;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        int input = 0;
        int result = 0;

        result = (int) (Math.random() * 100) + 1; // 1부터 100 사이 임의의 값
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1~100 사이 정수 입력 : ");

            input = sc.nextInt();

            if (input > result) {
                System.out.println("더 작은 수로 시도");
            } else if (input < result) {
                System.out.println("더 큰 수로 시도");
            }
        }while(input!=result); // do while문은 세미콜론 필수
        System.out.print("정답");
    }
}
