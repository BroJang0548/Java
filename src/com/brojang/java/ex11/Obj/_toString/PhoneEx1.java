package com.brojang.java.ex11.Obj._toString;


public class PhoneEx1 {
    public static void main(String[] args) {
        Phone1 phone = new Phone1("SS", "ANDROID");

        String strObj = phone.toString();
        System.out.println(strObj);

        System.out.println(phone);
    }
}
