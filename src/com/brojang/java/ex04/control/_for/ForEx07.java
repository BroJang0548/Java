package com.brojang.java.ex04.control._for;

public class ForEx07 {
    public static void main(String[] args) {
        // 이중for문
        for (int i = 0; i < 5; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j < 5; j++) {
                // continue를 하면 이 내부 for문의 증감식으로 되돌아간다
                if (j == 2) continue; 
                System.out.println("j= " + j);
            }
            System.out.println();
        }
    }
}
