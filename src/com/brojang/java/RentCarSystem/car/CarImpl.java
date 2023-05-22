package com.brojang.java.RentCarSystem.car;

import com.brojang.java.RentCarSystem.base.Base;

public class CarImpl extends Base implements Car {

    private String carNumber;
    private String carName;
    private String carColor;
    private int carSize;
    private String carMaker;

    // 정보 조회
    public String checkCarInfo(){
        System.out.println("Rent Car Search Time : "+ showTime());
        System.out.println("Rent Car Search");
        return "Rent Car Information";
    }

    @Override
    public void regCarInfo() {
        System.out.println("Rent Car Register Time : "+ showTime());
        System.out.println("Rent Car Register");
    }

    @Override
    public void modCarInfo() {
        System.out.println("Rent Car Modify Time : "+ showTime());
        System.out.println("Rent Car Modify");
    }

    @Override
    public void delCarInfo() {
        System.out.println("Rent Car Delete Time : "+ showTime());
        System.out.println("Rent Car Delete");
    }
}
