package com.brojang.java.ex08._class.superClass;

public class University  extends Student{

    // scores
    private int score;

    public University(String name, int grade, int score) {
        super();
        System.out.println("University constructor");
        super.name = name;
        super.grade = grade;
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
