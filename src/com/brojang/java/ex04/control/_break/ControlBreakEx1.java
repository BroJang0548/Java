package com.brojang.java.ex04.control._break;

public class ControlBreakEx1 {
    public static void main(String[] args) {
        // 추가 예제
        int count = 0;
        while (true){
            int num = (int) (Math.random() * 10) + 1;
            count++;
            System.out.println(num);
            if(num== 5)break;
        }
        System.out.println("총 반복 횟수 : "+count);
        System.out.println("종료");
        System.exit(0);
    }
}
