package com.brojang.java.RentCarSystem.reserve;

import com.brojang.java.RentCarSystem.base.Base;

public class ReserveImpl extends Base implements Reserve{

    // Member variables
    // Rent Car Number
    private String reserveCarNumber;

    // reservation Date
    private String reserveDate;

    // begin Date
    private String useBeginDate;

    // end Date
    private String useEndDate;


    // reserve car
    @Override
    public String reverseCar() {
        System.out.println("Rent Car Reservation Time : "+ showTime());
        System.out.println("Reserve Car");

        return "reserveCar Information";
    }

    // modify reservation
    @Override
    public void modReserveInfo() {
        System.out.println("Rent Car Reservation Modify Time : "+ showTime());
        System.out.println("Modify Reservation");
    }

    @Override
    public void cancelReserveInfo() {
        System.out.println("Rent Car Reservation Cancel Time : "+ showTime());
        System.out.println("Cancel Reservation");
    }
}
