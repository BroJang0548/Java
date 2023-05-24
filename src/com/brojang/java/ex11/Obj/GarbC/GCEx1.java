package com.brojang.java.ex11.Obj.GarbC;

public class GCEx1 {

    public static void main(String[] args) {
        Person person;

        person = new Person(1);
        person = null;
        person = new Person(2);
        person = new Person(3);
        person = new Person(4);

        System.out.println("--------------------------------");
        System.out.println(person);
        System.out.println(person.personNumber);
        System.out.println("--------------------------------");
        System.gc();

    }
}
