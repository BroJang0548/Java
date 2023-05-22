package com.brojang.java.ex11.Obj._clone;

public class MemberEx1 {
    public static void main(String[] args) {

        // 기존 원본 객체 생성
        Member org = new Member("brojang", "bro", "1234", 29, true);

        Member clone = org.getMember();

        clone.memPassword = "123456";

        System.out.println("clone data");
        System.out.println("id : " + clone.memId);
        System.out.println("name : " + clone.memName);
        System.out.println("password : " + clone.memPassword);
        System.out.println("age : " + clone.memAge);
        System.out.println("gender : " + clone.memGender);

        System.out.println();

        System.out.println("org data");
        System.out.println("id : " + org.memId);
        System.out.println("name : " + org.memName);
        System.out.println("password : " + org.memPassword);
        System.out.println("age : " + org.memAge);
        System.out.println("gender : " + org.memGender);
    }
}
