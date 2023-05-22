package com.brojang.java.ex10.except._throws;

public class ThrowsEx1 {
    public static void main(String[] args) {
        try{
            testClass();
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found Exception");
        }
    }

    public static void testClass() throws ClassNotFoundException{
        Class.forName("com.brojang.java.ex10.except.trycatchresources.TestClass123");
    }
}
