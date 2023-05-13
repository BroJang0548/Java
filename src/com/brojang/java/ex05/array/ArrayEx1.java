package com.brojang.java.ex05.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 들어가는 값은 공통타입만(int)
        int[] score = {70, 85, 90, 100, 95};

        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합계 : " + sum);
        System.out.println("평균 : " + sum / score.length);

    }
}
