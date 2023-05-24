package com.brojang.java.ex13.collection._Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        try {

            List<String> list = new ArrayList<String>();

            list.add("1");
            list.add("2");
            list.add("3");

            int size = list.size();
            System.out.println("객체 수 : " + size);
            System.out.println();

            String data1 = list.get(2);
            System.out.println("2: " + data1);
            System.out.println();

            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                System.out.println(i + ":" + str);
            }
            System.out.println();

            list.remove(2);
            list.remove(2);

            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                System.out.println(i + ":" + str);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}

