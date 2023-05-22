package com.brojang.java.ex04.control._if;

public class IfElse02 {
    public static void main(String[] args) {
        int firstNum =10;
        double secondNum = 0;
        double result = firstNum/secondNum; // 0으로 나누기 불가

//        System.out.println(result); // Infinity

        if(Double.isInfinite(result) || Double.isNaN(result)){
            System.out.println("정상적으로 값을 출력할 수 없습니다.");
        }else{
            System.out.println(result);
        }

    }

}
