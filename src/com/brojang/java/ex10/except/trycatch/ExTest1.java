package com.brojang.java.ex10.except.trycatch;

public class ExTest1 {
    public static void main(String[] args) {
        try{
            int[] num = new int[3];
            num[0] = 1;
            num[1] = 2;
            num[2] = 3;
            System.out.println(num[0]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
