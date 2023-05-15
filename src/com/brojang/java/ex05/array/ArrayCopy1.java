package com.brojang.java.ex05.array;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] oldArr = {1, 2, 3};
        int[] newArr = new int[5];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
            System.out.print(oldArr[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }
}
