package com.brojang.java.ex05.array;

public class ArrayEx2 {
    // main 메서드 static 메서드
    // 스태틱 메서드는 클래스 자체에 속한 메서드
    // 객체를 생성하지 않아도 클래스를 통해 호출할 수 있는 메서드
    public static void main(String[] args) {
        int[] score;
        score = new int[]{70, 85, 90, 100, 95};
        // new int 안쓰고 {70, 85, 90, 100, 95} 형태로 넣어도 된다.
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("합계 : " + sum);

        int sum2 = add(new int[]{70, 85, 100});
        System.out.println("합계 : " + sum2);

    }
    // instance 메서드
    // instance 메서드에서는 static 메서드에 접근 불가
    // 객체(인스턴스)를 생성한 후에 호출할 수 있는 메서드
    // 객체의 상태(인스턴스 변수 값)를 변경, 객체의 정보를 사용하여 특정한 작업을 수행
    static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
