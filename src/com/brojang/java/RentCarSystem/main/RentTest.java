package com.brojang.java.RentCarSystem.main;

import com.brojang.java.RentCarSystem.reserve.Reserve;
import com.brojang.java.RentCarSystem.car.Car;
import com.brojang.java.RentCarSystem.member.Member;

public class RentTest {
    public static void main(String[] args) {

        // join
        Member m = new Member();
        m.regMember();


        // search rent
        Car car = new Car();
        car.checkCarInfo();

        // reserve car
        Reserve reserve = new Reserve();
        reserve.reserveCar();


    }
}
