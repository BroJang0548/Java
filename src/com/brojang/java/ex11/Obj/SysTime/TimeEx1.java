package com.brojang.java.ex11.Obj.SysTime;

public class TimeEx1 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();

        int result = 0;

        for (int i = 0; i < 1000000; i++) {
            result += i;
        }
        long time2 = System.nanoTime();
        System.out.println("1~100만 합 : " + result);
        System.out.println("계산 소요 시간 : " + (time2 - time1)/1000 + " 마이크로미터");
    }
}
