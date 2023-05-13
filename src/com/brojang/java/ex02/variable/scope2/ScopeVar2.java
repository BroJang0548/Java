package com.brojang.java.ex02.variable.scope2;

public class ScopeVar2 {
    public static void main(String[] args) {
        int value1;

        if(true){
            int value2 ;

            value1 = 1;
            value2 = 2;
            System.out.println("첫번째 scope : "+value1);
            System.out.println("두번째 scope : "+value2);
        }

        // value2 = 30;

        // System.out.println("value2 : "+value2);

    }
}
