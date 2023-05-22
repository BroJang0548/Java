package com.brojang.java.ex11.Obj._deepclone;

import java.util.Arrays;

public class Member implements Cloneable {
    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        // copy
        Member clone = (Member) super.clone();

        // scores copy
        clone.scores = Arrays.copyOf(this.scores, this.scores.length);

        // car copy
        clone.car = new Car(this.car.model);

        // deep copy Member Object returned
        return clone;
    }

    public Member getMember() {
        Member clone = null;
        try {
            clone = (Member) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
