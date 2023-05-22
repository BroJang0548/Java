package com.brojang.java.ex09._interface;

public class BasicInterface {
    /**
     * interface
     * -> 일종의 추상클래스
     * -> 일반 메서드, 멤버 변수를 가질 수 없다.
     * -> 추상 클래스 : 미완성 설계도, 인터페이스 : 기본 설계도
     * -> 추상 클래스 : 부분적으로 완성
     * -> 인터페이스 : 구현된 것 자체가 없음. 밑그림 형태만 존재
     *
     * interface interfaceName {
     *     // interface 접근 제어자도 public, default만 가능
     * }
     *
     * interface 제약사항
     * -> 멤버 변수의 경우 static 메서드와 default 메서드를 제외하고는 무조건 public static final이어야 한다(생략 가능)
     * -> 모든 메서드는 public abstract 이어야 한다.(예외없이 적용되기 대문에 생략 가능)
     * -> 생략된 것들은 컴파일 시에 컴파일러가 자동적으로 추가
     *
     * keyword
     * -> class className implements interfaceName{
     *     // interface에 정의된 추상메서드 구현
     *    }
     *
     * interface 메서드 중 일부만 구현할 경우 abstract 메서드를 붙여서 추상 클래스로 선언해야 한다.
     * -> abstract class className implements interfaceName{
     *     // method
     *     public void method1(int a, int b){}
     * }
     *
     * 상속과 구현을 동시에도 가능
     * class className extends superClass implements interfaceName{
     *     public void method1(){}
     *     public void method2(){}
     * }
     *
     * ※ interfaceName은 ~able 형태로 끝나는 경우가 많다.
     *
     *
     * 인터페이스는 다중상속이 가능하다.
     * -> 하지만 직접 다중상속을 구현하는 경우는 거의 없다.
     *
     * interface 장점
     * -> 개발시간 단축
     * -> 표준화
     * -> 독립적
     * -> 정형화
     *
     *
     * default 메서드
     *  -> JDK 1.8에서 추가
     *  -> 기존에는 interface에서 구현한 모든 추상 메서드를 추가
     *  -> interface에서 구현하지 않을 기능도 추가해야 했는데,
     *  default 메서드가 나옴으로써 해결이 됨 (default로 설정한 인터페이스는 구현하지 않아도 됨)
     *
     *  default 키워드를 접근제어자에 작성하게 되면 해당 클래스는 오버라이딩 하지 않아도 된다.
     *
     *
     *
     */
}
