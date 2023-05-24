package com.brojang.java.ex11.Obj.GarbC;

public class Person {
    public int personNumber;

    public Person(int personNumber) {
        this.personNumber = personNumber;
        System.out.println(personNumber + " Stacked");
    }

    protected void finalize() {
        System.out.println(personNumber + " Removed");
    }
}
