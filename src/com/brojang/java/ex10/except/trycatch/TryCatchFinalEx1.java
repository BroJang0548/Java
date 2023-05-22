package com.brojang.java.ex10.except.trycatch;

public class TryCatchFinalEx1 {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException 발생");
//            return;
        }
        try {
            int val1 = Integer.parseInt(data1);
            int val2 = Integer.parseInt(data2);
            int result = val1 + val2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환 불가");
        } finally {
            System.out.println("종료");
        }
    }
}