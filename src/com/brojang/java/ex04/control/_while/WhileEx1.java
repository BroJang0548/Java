package com.brojang.java.ex04.control._while;

public class WhileEx1 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (true) {
            sum += n;

            if (sum >= 100)
                break;
            else
                n++;
        }
        System.out.println("합계가 100이상이 되게하는 최초 n 값 : " + n);
        System.out.println("n까지 더한 합 : " + sum);

    }
}
