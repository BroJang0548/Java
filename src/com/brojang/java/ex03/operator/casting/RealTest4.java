package com.brojang.java.ex03.operator.casting;

public class RealTest4 {
    public static void main(String[] args) {
        double d = 10;
        int i1 = 3;
        System.out.println(d/i1);

        String str = "123";
        int i2 = 4;
//        System.out.println(str/i2);
//        System.out.println((int)str/i2);
        System.out.println(Integer.parseInt(str)/i2);
        System.out.println(Double.parseDouble(str)/i2);

    }
}
