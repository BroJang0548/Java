package com.brojang.java.ex03.operator.overflow;

public class OverflowTest1 {
    public static void main(String[] args) {

        // overflow 1
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a * b);
        System.out.println(c); // 44

        // overflow 2
        int i1 = 1000000;
        int i2 = 2000000;
        // int 타입간 연산의 결과가 int
        long i3 = i1 * i2;
        System.out.println(i3);

        // overflow 3
        long l1 = 1000000*1000000;
        long l2 = 1000000*1000000L;
        System.out.println(l1);
        System.out.println(l2);
    }

}
