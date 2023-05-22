package com.brojang.java.ex10.except.trycatchresources;

public class TryWithResourcesEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            fis.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
