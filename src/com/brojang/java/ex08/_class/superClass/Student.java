package com.brojang.java.ex08._class.superClass;

public class Student {
    // name
    protected String name;

    // grade
    protected int grade;

    public Student(){
        System.out.println("Student constructor");
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getInfo(){
        System.out.println("run to Student Get Info ");
        return "Name: " + name + "\nGrade: " + grade;
    }
}
