package com.brojang.java.ex03.operator.casting;

public class CharCastingExtend1 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char one = '1';

        System.out.printf("'%c'- '%c' = %d\n", d, a, d - a);
        System.out.printf("'%c'- '%c' = %d\n", one, zero, one - zero);
        System.out.printf("'%c' = %d\n",a, (int)a);
        System.out.printf("'%c' = %d\n",d, (int)d);


    }

}
