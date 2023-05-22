package com.brojang.java.ex11.Obj._clone;

public class Member implements Cloneable {
    public String memId;
    public String memName;
    public String memPassword;
    public int memAge;
    public boolean memGender;

    public Member(String memId, String memName, String memPassword, int memAge, boolean memGender) {
        this.memId = memId;
        this.memName = memName;
        this.memPassword = memPassword;
        this.memAge = memAge;
        this.memGender = memGender;
    }

    public Member getMember() {
        Member clone = null;

        try {
            clone = (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


}
