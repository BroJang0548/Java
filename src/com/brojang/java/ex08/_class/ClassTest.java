package com.brojang.java.ex08._class;

class Electronic {

    String name; // 이름
    boolean power; // 전원 상태
    int voltage; // 전력
}

public class ClassTest {
    public static void main(String[] args) {
        Electronic elec = new Electronic();
        elec.name = "L사";
        elec.power = true; // 전원 On
        elec.voltage = 500; // 전력
        System.out.println(elec.name);
        System.out.println(elec.power);
        System.out.println(elec.voltage);
    }
}