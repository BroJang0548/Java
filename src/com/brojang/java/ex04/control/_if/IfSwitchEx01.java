package com.brojang.java.ex04.control._if;

public class IfSwitchEx01 {
    // JDK 14에서 arrow 함수 지원
    public static void main(String[] args) {
        char grade = 'C';
        
        switch (grade){
            case 'A','a' -> {
                System.out.println("A 등급");
            }
            case 'B','b' ->{
                System.out.println("B 등급");
            }
            default -> {
                System.out.println("등급?");
            }
        }

    }
}
