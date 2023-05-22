package com.brojang.java.ex11.Obj._equals;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member m = (Member) obj;
            if (id.equals(m.id)) {
                return true;
            }
        }
        return false;
    }

}
