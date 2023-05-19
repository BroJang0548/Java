package com.brojang.java.ex08._class.polym;

public class Elementary extends Student{
    public Elementary(String name, int grade,int point){
        super.name=name;
        super.grade=grade;

    }

    public Elementary(String name, int grade){
        super.name=name;
        super.grade=grade;
    }

    public Elementary(){
        this("bro",3);
    }
}
