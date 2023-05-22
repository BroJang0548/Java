package com.brojang.java.ex04.control._if;

public class ifSwitch01 {
    public static void main(String[] args) {
        // switch
        /*
         *   switch(조건식){
         *       case 값1:
         *           // 조건식이 값 1일 경우 수행
         *           break;
         *       case 값1:
         *           // 조건식이 값 1일 경우 수행
         *           break;
         *      default:
         *          // 일치하는 조건식이 없을 때 기본으로 수행
         *          // JDK 8때 기준
         *          // 여기서 중요한 부분은, case 값은 반드시 상수
         *          // switch 조건식은 정수, 문자열만 지원
         *          // JSK 12때 조건식 타입 범위 확장
         *          // 정수, 문자열, Enum 지원
         *          // JDK 16에서 패턴매칭 사용 타입 패턴 지원
         *   }
         * */
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("1 출력");
                break;
            default:
                System.out.println("default 출력");
        }

    }
}
