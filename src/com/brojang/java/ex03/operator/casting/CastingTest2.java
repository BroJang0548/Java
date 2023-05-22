package com.brojang.java.ex03.operator.casting;

public class CastingTest2 {
    public static void main(String[] args) {
        System.out.printf("name : %s","bro"); // printf는 기본적으로 줄개행을 하지 않음

        System.out.printf("age : %d\n",29);
        
        // printf를 쓰는 이유

        byte b = 1;
        short s = 2;
        char c = 'A';

        int i = 10;
        long big = 100_000_000_000L;

        System.out.printf("b=%d\n",b);
        System.out.printf("s=%d\n",s);
        System.out.printf("c=%c\n",c);
//        System.out.printf("c=%d\n",(c);
        System.out.printf("c=%d\n",(int)c);
        System.out.printf("i =[%5d]%n",i);
        System.out.printf("i =[%-5d]%n",i);
        System.out.printf("i =[%05d]%n",i);
    }
}
