package com.brojang.java.ex10.except;

public class ExceptHandling {
    // 프로그램 오류

    /*
     * 프로그램 실행 도중 에러 or 오작동 시 비정상적으로 종료되는 경우가 존재
     *
     * 에러 종류는 크게 3가지
     * 1. compile error
     * 2. runtime error
     * 3. logical error
     *
     * compile error
     * -> 컴파일 시 에러 발생
     * -> 오탈자, 잘못된 문법 사용, 라이브러리 에러 등으로 발생
     *
     * runtime error
     * -> 프로그램 실행 시 발생
     * -> compile error에서 감지할 수 없는 에러
     * -> 예외 처리로 대응 가능
     *
     * Logical error
     * -> 프로그램이 예측대로 동작하지 않는 경우 발생
     * -> 별도의 오류나 에러가 생기지 않음
     *
     *
     * Error, Exception 차이
     *
     * Error : 시스템 레벨에서 발생 (프로그램의 코드로 수습 불가)
     * Exception : 응용 프로그램(Application) 레벨에서 발생 (프로그램 코드로 수습 가능)
     *
     * 시스템 레벨 : 운영체제, 하드웨어 관련 (JVM, Network Error)
     * -> 개발자가 직접 제어할 수 없는 영역(운영체제, 하드웨어 업그레이드 등)
     * 응용 프로그램 레벨 : 개발자가 제작한 프로그램의 실행 도중 발생하는 문제 (Exception)
     * -> 예외처리, 로직 설계 가능. 개발자가 처리 가능
     *
     * 예외 종류
     * Throwable 클래스 상속
     *
     * 예외에는 2가지 종류 CheckedException, UncheckedException 2가지로 분류된다.
     *
     * CheckedException : 컴파일 시점에 예외 처리 필요
     * -> IOException, SQLException 등이 존재
     * UncheckedException : 컴파일 시점이 아닌 런타임 시 발생
     * -> NullPointerException, ArrayIndexOutOfBoundsException 등이 존재 (Runtime Exception도 존재)
     * ※ Runtime Exception : 프로그래머 실수로 발생하는 Exception
     *
     * 예외처리
     * try ~ catch문 사용
     * -> 예외 발생으로 인한 비정상적인 종료 방지
     * -> JVM의 예외처리기(UncaughtExceptionHandler)가 원인을 출력해준다.
     *
     * 문법
     *
     * try{
     *      // 예외 발생 가능 문장
     * }catch(Exception e){
     *      // try에서 Exception이 발생 할 경우 실행 문장
     * }
     *
     * throws : 사용자가 고의로 예외 발생 가능
     * try catch 대신 사용 가능
     * Class 뒤에 throws Exception 종류 입력
     */
}
