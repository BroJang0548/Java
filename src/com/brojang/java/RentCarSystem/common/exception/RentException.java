package com.brojang.java.RentCarSystem.common.exception;

import java.util.Calendar;

public class RentException extends Exception {
    private String message; // 예외 전달 변수

    public RentException(String message) {
        super(message);
        this.message = message;
    }

    public String toString() {
        return "예외 메시지 : " + message;
    }

    public String getRentExceptionInfo() {
        String errMessage = "예외 발생 시간 : " + showErrorTime() +
                "\n예외내용 : " + message;
        return errMessage;
    }

    public static String showErrorTime() {
        String date = null;
        String time = null;

        Calendar cal = Calendar.getInstance();

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        date = year + "년 " + month + "월 " + day + "일 " + hour + ":" + minute + ":" + second;
        return date + " " + time;
    }

}
