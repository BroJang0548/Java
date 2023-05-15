package com.brojang.java.ex08._class;

public class MethodTest1 {
    void printTest1() {
        System.out.println("MethodTest");
        return; // default method 출력
    }

    int printTest2(int x, int y) {
        return x + y;
    }

    int printTest3(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        MethodTest1 methodTest1 = new MethodTest1();

        int result = methodTest1.printTest3(10, 20);
        System.out.println(result);
//        System.out.println(printTest3(10, 20));
    }

}
