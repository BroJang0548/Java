package com.brojang.java.ex13.collection._Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        // Iterator
        // 배열, 리스트를 반복시켜주는 객체
        // next, previous 등의 메서드 기능 지원
        // List, Set 등의 Collection에 접근 가능
        // 반복하는 요소에 대해 읽기, 쓰기, 삭제 등이 가능(추상화)

        // Set
        // 순서 보장 X, 중복 허용 X

        // Map
        // 중복 허용 X


        List list = new ArrayList<List>();

        list.add("Test1");
        list.add(new Integer(100));
        list.add("1234");


        Iterator iter = list.iterator();
    }
}
