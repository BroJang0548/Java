package com.brojang.java.ex09._interface;

public class InnerClassTest {
    // 내부 클래스(Inner Class)
    /*
     * 클래스 내에 선언된 클래스
     *
     * 내부 클래스에서 외부 클래스에 쉽게 접근 가능
     *
     * static or non-static으로 선언 가능
     *
     * Inner Class 종류
     * Member Inner Class
     * Local Inner Class
     * Anonymous Inner Class
     * Static Nested Class
     *
     * 특징
     * -> 캡슐화 :
     */

    int data = 0;
    static int staticData = 0;

    void initData() {
        int dt = 0;
    }

}

class OuterClass {
    class InnerClass {
    }

    static class InnerStaticClass {
    }

    void initData() {
        class LocalInnerClass {
        }
    }
}
