package com.brojang.java.ex11.Obj._hashcode;


import java.util.HashMap;

public class KeyEx1 {
    public static void main(String[] args) {

        // Key 객체 식별
        HashMap<KeyTest,String> hashMap = new HashMap<>();

        hashMap.put(new KeyTest(1),"bro");

        String value = hashMap.get(new KeyTest(1));
        System.out.println(value);

        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());

    }
}
