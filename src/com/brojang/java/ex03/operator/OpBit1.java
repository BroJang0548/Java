package com.brojang.java.ex03.operator;

public class OpBit1 {
    public static void main(String[] args) {
        // 비트 연산
        byte i1 = 10;

        System.out.printf("i1 : %d\t %s\n",i1,toBinaryString(i1));
        System.out.printf("~i1 : %d\t %s\n",~i1, toBinaryString(~i1));
        System.out.printf("~i1+1 : %d\t %s\n",~i1+1, toBinaryString(~i1));
        System.out.printf("~~i1 : %d\t %s\n",~~i1, toBinaryString(~~i1));
    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }
}