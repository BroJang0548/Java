package com.brojang.java.ex04.control._if;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' '; // 초기화는 공백으로. 단순히 ''로 붙여쓰는것은 초기화가 아님

        System.out.print("점수 입력 : ");
        Scanner sc = new Scanner(System.in);

        score = sc.nextInt();

        // 주의할 점은 큰수부터 작은 수로 줄여가야 한다.
        // 낮은 수부터 올려가면 첫번째 조건이 충족이 될 경우가 발생
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("본인 학점 : "+grade);
    }
}
