package com.brojang.java.ex08._class.polym;

public class Student {
    public String name;
    public int grade;

    public Student(){
        System.out.println("Student constructor");
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }

    public String getStInfo(){
        System.out.println("Student Class Methods Called");
        return "Name: " + name + " Grade: " + grade;
    }
}
