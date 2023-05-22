package com.brojang.java.ex04.control._break;

public class ControlBreakEx2 {
    public static void main(String[] args) {
        Label1:
        for (char up = 'A'; up <= 'Z'; up++) {
            for (char low = 'a'; low <= 'z'; low++) {
                System.out.println(up + "-" + low);
                if (low == 'g') {
                    break Label1;
                }
            }
        }
    }
}
