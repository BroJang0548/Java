package com.brojang.java.ex05.array;

public class AvailArray1 {
    public static void main(String[] args) {
        int[][] score = new int[3][];

        // 각각 다른 길이 지정 가능
        score[0] = new int[3];
        score[1] = new int[4];
        score[2] = new int[2];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
    }
}
