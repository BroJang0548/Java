package com.brojang.java.ex04.control._if;

import java.util.Scanner;

public class IfSwitchEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 값 > ");
        String grade = sc.next();

        // JDK 11 이전
        int score = 0;

        switch (grade){
            case "a","A":
                score = 100;
                break;
            case "b","B":
                score = 90;
                break;
            default:
                score = 80;
        }
        System.out.println(score);
        // JDK 12 부터
        // 함수 선언하듯이
        int score2 = switch (grade){
            case "a","A"-> 100;
            case "b","B"-> {
                int result = 90;
                // 아니면..
                //  `yield` 키워드를 사용할 때는 `yield` 다음에 바로 결과값을 반환
                yield result;
            }
            default -> 80;
        };
        System.out.println("score : "+score2);
    }
}
