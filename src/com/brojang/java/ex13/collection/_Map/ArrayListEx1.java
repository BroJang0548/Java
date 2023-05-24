package com.brojang.java.ex13.collection._Map;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // ArrayList (가변 배열)
        /*
        * 가변적으로 데이터 크기 조절 가능한 배열(동적으로 크기 조절)
        *
        * 객체만 저장이 가능하다. (Primitive Type 사용 불가)
        * ※ Wrapper Class를 활용해서 Integer, Double 등으로 객체화 한 뒤 저장 가능
        *
        * Index 요소 접근
        *
        * 제네릭 지원
        * -> 저장될 객체 타입 지정 가능
        *
        *
        *
        */



        List list = new ArrayList(); // 가변 배열


        list.add("abc");
        list.add(new Integer(100));

        String name = (String) list.get(0);
        Integer i = (Integer) list.get(1);

        System.out.println("name : " + name);
        System.out.println("i : " + i);

        System.out.println(list.size()); // 2
        System.out.println(list);
        list.remove(1);
        System.out.println(list.size()); // 1

        System.out.println(list);
    }
}
