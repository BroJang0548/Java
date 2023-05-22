package com.brojang.java.ex05.array;

public class DoubleArrayEx2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 첫번째 차원 길이
        System.out.println(arr.length);

        // 그럼 두번째 차원의 길이는?
        System.out.println(arr[0].length);

        // 이건 됨
        //int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        // 이건? 배열 길이가 다 다를때?
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        System.out.println(arr2.length);

        System.out.println(arr2[0].length); // 4
        System.out.println(arr2[1].length); // 2
        System.out.println(arr2[2].length); // 3

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("Arr[" + i + "][" + j + "] = " + arr2[i][j]);
            }
        }
    }
}
