package com.brojang.java.ex04.control._if;

public class ifSwitch02 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*3) + 1;

        switch (num){
            case 1:
                System.out.println("1 출력");
                break;
            case 2:
                System.out.println("2 출력");
                break;
            case 3:
                System.out.println("3 출력");
                break;
        }
    }

}
