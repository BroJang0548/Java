package com.brojang.java.ex08._class.singleton;


public class SingletonEx {
    public static void main(String[] args) {

        // static method
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        // method equals
        if (obj1 == obj2) {
            System.out.println("obj1 == obj2"); // equals
        } else {
            System.out.println("obj1!= obj2");   //not equals
        }
    }
}
