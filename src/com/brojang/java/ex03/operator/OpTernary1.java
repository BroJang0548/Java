package com.brojang.java.ex03.operator;

public class OpTernary1 {
    public static void main(String[] args) {
        int data = 10;
        String result = data > 10 ? "10보다 큼" : data == 10 ? "10" : "10보다 작음";
        System.out.println(result);

    }
}
