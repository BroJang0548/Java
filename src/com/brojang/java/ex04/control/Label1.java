package com.brojang.java.ex04.control;

public class Label1 {
    public static void main(String[] args) {
        Label1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 5) {
//                    break; //해당 break가 속한 하나의 반복문만 벗어남
                    break Label1; // 라벨 있는 곳까지 모두 벗어남(하나의 반복문이 아닌 여러개의 반복문도 건너뜀)
                }
                    System.out.println(i + " * " + j + " = " + (i * j));

            }
        }
    }
}
