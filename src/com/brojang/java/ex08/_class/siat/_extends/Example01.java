package com.brojang.java.ex08._class.siat._extends;

public class Example01 {

    // 상속
    /*
     * - 하나의 객체에서 다른 객체의 속성과 기능을 그대로 물려받는 것
     * - 상속 문법 : 클래스 extends 부모클래스
     * - 상속을 하는 쪽을 자식 클래스, 받는 쪽을 부모 클래스라 부른다.
     * - 자바에서의 상속은 다중 상속은 일어나지 않으며 오로지 단일 상속만 가능하다.
     * - 자바에서의 생성자는 상속되지 않으며 참조만 가능하다.
     * - 자바에서도 오버라이드가 가능하며 부모의 기능을 자식에서 그대로 선언하여 사용이 가능하다.
     * - 단 오버라이드 시 자식 메서드는 리턴타입과 이름, 매개변수의 타입과 개수가 전부 통일해야 한다.
     * */

    // 생성자 기준으로 extends 찾아 들어감


    public static void main(String[] args) {
        // Child1 class <- Parent class
        Child1 child1 = new Child1();

        child1.pa1 = 3;
//        child1.pb1 = "Hello World";

        System.out.println(child1.pa1);
//        System.out.println(child1.pb1);
    }
}
