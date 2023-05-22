package com.brojang.java.ex11.Obj._hashcode;

public class KeyTest {
    public int number;

    public KeyTest(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof KeyTest)) return false;

        KeyTest keyTest = (KeyTest) obj;

        return number == keyTest.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
