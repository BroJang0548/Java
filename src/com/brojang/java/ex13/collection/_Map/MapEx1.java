package com.brojang.java.ex13.collection._Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        /*
        * HashTable, HashMap
        * -> Key , Value 구성
        *   key 값 : 중복 불가
        *   value 값 : 중복 가능
        *
        *
        * HashTable 이후 HashMap이 등장
        * -> 성능적으로 HashMap이 상대적으로 유리
        *
        * HashMap : Null값 허용(key, Value)
        * HashTable : Null 값 비허용(key, Value)
        *
        *
        *
        */
        Map map = new HashMap();

        map.put(1, new Integer(100));
        map.put(2, "Hello World!!");
        map.put("fourth", null); // HaspMap은 null을 허용한다.

        Integer i = (Integer) map.get(1);
        String str = (String) map.get(2);

        System.out.println(i);
        System.out.println(str);

        System.out.println(map.get(3)); //자동 형변환.
        System.out.println(map.get(4));
    }

}
