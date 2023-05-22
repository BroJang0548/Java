package com.brojang.java.ex08._class.AbsClass;

public interface AbstractClassEx2 {
    // 상수 선언
    int MAX_VALUE = 10;
    int MIN_VALUE = 0;

    // abstract method
    void countUp();

    void countDown();

    void increase(int value);

    // default method
    default void increment(boolean count) {
        if (count) {
            System.out.println("값 증가 해제");
        } else {
            System.out.println("값 증가 설정");
        }
    }


}
