package com.brojang.java.ex05.array;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
