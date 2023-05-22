package com.brojang.java.ex11.Obj._toString;

public class Phone1 {
    private String company;
    private String hardware;

    public Phone1(String company, String hardware) {
        this.company = company;
        this.hardware = hardware;
    }

    @Override
    public String toString() {
        return "Phone1{" +
                "company='" + company + '\'' +
                ", hardware='" + hardware + '\'' +
                '}';
    }

}
