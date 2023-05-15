package com.brojang.java.ex06._String;

public class StringEx01 {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str);

        if(str.equals("Hello World!")){
            System.out.println("값이 같은가");
        }else{
            System.out.println("값이 다른가");
        }

        char[] arr = {'a', 'b', 'c'};
        String str2 = new String(arr);
        char[] tmp = str2.toCharArray();
    }
}
