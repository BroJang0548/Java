package com.brojang.java.ex02.variable.type3;

public class ByteTest3 {
    public static void main(String[] args) {
        byte b = 120;
        System.out.println(b);
        System.out.println(b + 8);
        System.out.println((byte) (b + 8)); // type byte 연산
        System.out.println((byte) b + 8); // byte b + int 8

    }
}
