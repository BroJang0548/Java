package com.brojang.java.ex04.control._continue;

import java.util.Scanner;

public class ContinueEx3 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------");
            System.out.println("1번 메뉴");
            System.out.println("2번 메뉴");
            System.out.println("3번 메뉴");
            System.out.println("종료하고 싶으면 0 입력");
            System.out.print("메뉴 선택 : ");

            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (1 <= menu && menu <= 3) {
                System.out.println("선택한 메뉴 : " + menu);
                System.out.println();
            }else{
                System.out.println("번호 잘못눌렀다");
                System.out.println();
                continue;
            }
        }
    }
}
