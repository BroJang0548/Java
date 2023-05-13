package com.brojang.java.ex02.variable.scope2;

public class ScopeVar3 {
    public static void main(String[] args) {
        int i1 = 10;

        if(i1 > 5){
            int i2;
            i2 = i1 -5;
            System.out.println(i2);
        }
        System.out.println(i1);
//        System.out.println(i2); // i2 변수 사용 불가
    }
}
