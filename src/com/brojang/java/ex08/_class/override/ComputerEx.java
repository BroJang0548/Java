package com.brojang.java.ex08._class.override;

public class ComputerEx {
    public static void main(String[] args) {
        int i1 = 20;
        int i2 = 30;
        Calculator calculator = new Calculator();
        System.out.println("calculator add result : " + calculator.add(i1, i2));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("computer add result : " + computer.add(i1, i2));

    }
}
