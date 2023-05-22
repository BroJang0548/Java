package com.brojang.java.RentCarSystem.reserve;

public interface Reserve {

    // rentCar reversations
    public String reverseCar();

    // modify rentCar
    public void modReserveInfo();

    // cancel rentCar
    public void cancelReserveInfo();


//    // reserved id
//    private String resId;
//
//    // reserved car number
//    private String resCarNumber;
//
//    // reserved date
//    private String resDate;
//
//    // reserved begin date
//    private String resBeginDate;
//
//    // reserved end date
//    private String resEndDate;
//
//
//    //getter setter
//    public String getResId() {
//        return resId;
//    }
//
//    public void setResId(String resId) {
//        this.resId = resId;
//    }
//
//    public String getResCarNumber() {
//        return resCarNumber;
//    }
//
//    public void setResCarNumber(String resCarNumber) {
//        this.resCarNumber = resCarNumber;
//    }
//
//    public String getResDate() {
//        return resDate;
//    }
//
//    public void setResDate(String resDate) {
//        this.resDate = resDate;
//    }
//
//    public String getResBeginDate() {
//        return resBeginDate;
//    }
//
//    public void setResBeginDate(String resBeginDate) {
//        this.resBeginDate = resBeginDate;
//    }
//
//    public String getResEndDate() {
//        return resEndDate;
//    }
//
//    public void setResEndDate(String resEndDate) {
//        this.resEndDate = resEndDate;
//    }
//
//    @Override
//    public String toString() {
//        return "Reserve{" +
//                "resId='" + resId + '\'' +
//                ", resCarNumber='" + resCarNumber + '\'' +
//                ", resDate='" + resDate + '\'' +
//                ", resBeginDate='" + resBeginDate + '\'' +
//                ", resEndDate='" + resEndDate + '\'' +
//                '}';
//    }
//
//    //차를 예약하는 기능을 하는 메소드
//    public void reserveCar() {
//        System.out.println("차를 예약합니다.");
//    }
//
//    //차 예약정보를 수정하는 메소드
//    public void modReserveInfo() {
//
//    }
//
//    //차 예약 정보를 취소하는 메소드
//    public void cancelReserveInfo() {
//
//    }
}
