package com.brojang.java.ex11.Obj._deepclone;

public class MemberEx1 {
    public static void main(String[] args) {
        Member original = new Member("bro", 29, new int[]{50, 50}, new Car("K9"));

        Member clone = original.getMember();
        clone.scores[0] = 100;
        clone.car.model = "Ford";

        System.out.println("Copy of clone field");
        System.out.println("name : " + clone.name);
        System.out.println("age : " + clone.age);
        System.out.print("scores : ");
        for (int i = 0; i < clone.scores.length; i++) {
            System.out.print(clone.scores[i] + " ");
            System.out.print(i == (clone.scores.length - 1));
        }
        System.out.println("}");
        System.out.println("car : " + clone.car.model);
        System.out.println();

        System.out.println("Original field");
        System.out.println("name : " + original.name);
        System.out.println("age : " + original.age);
        System.out.print("scores : {");
        for (int i = 0; i < original.scores.length; i++) {
            System.out.print(original.scores[i] + " ");
            System.out.print(i == (original.scores.length - 1));
        }
        System.out.println("}");
        System.out.println("car : " + original.car.model);
    }
}
