package com.brojang.java.ex06._String;

public class StringEx02 {
    public static void main(String[] args) {
        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println(ch);
        }
        char[] chArr = src.toCharArray(); // String을 char[]로 변환

        System.out.println(chArr);

        int[][] arr = {new int[]{1, 2, 3}, new int[]{4, 5,}, {3}
        };
    }
}