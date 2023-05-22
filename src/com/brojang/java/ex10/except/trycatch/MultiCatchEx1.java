package com.brojang.java.ex10.except.trycatch;

public class MultiCatchEx1 {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("배열 값 초과 or 숫자 변환 불가");
        } catch (Exception e) {
            System.out.println("배열 값 초과도 아니고 숫자 변환 불가 오류도 아닌 다른 예외  ");
        } finally { // Exception과 상관없이 실행
            System.out.println("종료");
        }
    }
}
