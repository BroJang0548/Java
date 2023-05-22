package com.brojang.java.ex05.array;

public class ArrayAdEx3 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        // 값 입력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 3 * (i + 1) * (j + 1);
            }
        }

        // 결과 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
