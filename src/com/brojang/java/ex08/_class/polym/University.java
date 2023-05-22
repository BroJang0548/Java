package com.brojang.java.ex08._class.polym;

public class University extends Student {
    private int course;

    public University(String name, int grade, int course) {
        super();
        System.out.println("University constructor");
        super.name = name;
        super.grade = grade;
        this.course = course;
    }

    public University() {
        this("bro", 2, 20);
    }

    public int getCourse() {
        return course;
    }

    // override
    public String getStInfo() {
        System.out.println("getStInfo class override method called");
        return "이름 : " + name + ", grade : " + grade + ", course : " + course;
    }
}
