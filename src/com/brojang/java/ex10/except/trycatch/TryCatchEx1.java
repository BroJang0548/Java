package com.brojang.java.ex10.except.trycatch;

public class TryCatchEx1 {
    public static void main(String[] args) {
        try{
            Class clazz = Class.forName("java.lang.String123");
        }catch (ClassNotFoundException e){
            System.out.println("클래스 없음");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
