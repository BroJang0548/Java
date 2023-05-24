package com.brojang.java.ex11.Obj.Wrapper;

public class BoxingTest2 {
    public static void main(String[] args) {
        //Boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("200");
        Integer i3 = Integer.valueOf("300");

        // UnBoxing
        int value1 = i1.intValue();
        int value2 = i2.intValue();
        int value3 = i3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
