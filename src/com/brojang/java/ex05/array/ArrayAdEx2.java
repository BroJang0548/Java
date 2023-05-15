package com.brojang.java.ex05.array;

public class ArrayAdEx2 {
    public static void main(String[] args) {
        // 배열
        int[] score = {60, 70, 80, 90, 100};

        //합계용
        int sum = 0;

        for (int idx : score) {
            sum += idx;
        }
        System.out.println("합계 : " + sum);

    }
}
