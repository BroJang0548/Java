package com.brojang.java.ex05.array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = {80, 90, 100};

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("합계 : " + sum);
    }
}
