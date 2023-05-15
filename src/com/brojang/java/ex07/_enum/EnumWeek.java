package com.brojang.java.ex07._enum;

import java.util.Calendar;

public class EnumWeek {

    public static void main(String[] args) {
        Week today = null;

        // 현재 시스템의 기본 시간대를 가져옴
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;

            case 2:
                today = Week.MONDAY;
                break;

            case 3:
                today = Week.TUESDAY;
                break;

            case 4:
                today = Week.WEDNESDAY;
                break;

            case 5:
                today = Week.THURSDAY;
                break;

            case 6:
                today = Week.FRIDAY;
                break;

            case 7:
                today = Week.SATURDAY;
                break;

            default:
                break;
        }
        System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("오늘은 일요일");
        } else {
            System.out.println("일해라");
        }
    }
}
