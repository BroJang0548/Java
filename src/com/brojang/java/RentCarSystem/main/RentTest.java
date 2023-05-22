package com.brojang.java.RentCarSystem.main;

import com.brojang.java.RentCarSystem.car.Car;
import com.brojang.java.RentCarSystem.car.CarImpl;
import com.brojang.java.RentCarSystem.common.exception.RentException;
import com.brojang.java.RentCarSystem.common.util.UtilDP;
import com.brojang.java.RentCarSystem.member.Member;
import com.brojang.java.RentCarSystem.member.MemberImpl;
import com.brojang.java.RentCarSystem.reserve.Reserve;
import com.brojang.java.RentCarSystem.reserve.ReserveImpl;

public class RentTest {
    public static void main(String[] args) {
        String carInfo;
        String reserveData;

        try {
            // join
            Member member = new MemberImpl();
            member.regMember();

            // Search rent
            Car car = new CarImpl();
            carInfo = car.checkCarInfo();
            System.out.println(carInfo);
            System.out.println(car.checkCarInfo());

            UtilDP.displayData(carInfo);


            // reserve car
            Reserve reserve = new ReserveImpl();
            reserveData = reserve.reverseCar();
            System.out.println(reserveData);

            // modify reverse
            reserve.modReserveInfo();

            // cancel rent
            reserve.cancelReserveInfo();

        } catch (RentException e) {
            System.out.println(e.getRentExceptionInfo());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        // join
//        Member m = new Member();
//        m.regMember();
//
//
//        // search rent
//        Car car = new Car();
//        car.checkCarInfo();
//
//        // reserve car
//        Reserve reserve = new Reserve();
//        reserve.reserveCar();


    }
}
