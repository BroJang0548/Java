package com.brojang.java.ex11.Obj._equals;

public class MemberEx1 {
    public static void main(String[] args) {
        Member m1 = new Member("1");
        Member m2 = new Member("1");
        Member m3 = new Member("2");


        // 객체는 equals로 비교
        if (m1.equals(m2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (m1.equals(m3)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }
}
