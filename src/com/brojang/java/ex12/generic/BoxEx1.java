package com.brojang.java.ex12.generic;

public class BoxEx1 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("JAVA");
        String str = box1.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(123);
        int value = box2.get();

    }
}
