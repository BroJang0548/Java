package com.brojang.java.ex05.array;

public class DoubleArrayEx1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        // 이차원 배열 선언시
        // 배옆 앞은 필수 초기화 , 뒷 배열은 자율
        // int[][] Arr2 = new int[3][];
        System.out.println(arr.length); // 0 , 1 , 2 : 3개
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Arr[" + i + "][" + j + "]");
            }
        }
    }
}
