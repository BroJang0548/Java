package com.brojang.java.ex03.operator;

public class OpInstanceOf1 {
    public static void main(String[] args) {

        String addr = "경기도 성남시 분당구";
        if(addr instanceof String){ // 변수 instanceof 타입
            System.out.println("변수 타입 String");
        }
    }

}
