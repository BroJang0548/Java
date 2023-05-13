package com.brojang.java.ex04.control._if;

public class IfSwitchEx03 {
    public static void main(String[] args) {
        Object obj = "Hello Java";
        // JDK 16에서 추가된 패턴 매칭 기법
        switch (obj){
            case Integer i
                    -> System.out.println(i);
            case String str
                    -> System.out.println(str);
            case Double d
                    -> System.out.println(d);
            default
                    -> System.out.println("알 수 없는 타입");
        }
    }
}
