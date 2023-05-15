package com.brojang.java.ex08._class;

class Electronic1 {
    public String name;
    public int temperature;
    public boolean power;
    public String manufacturer;

    // 기능
    public void power() {
        power = true;
    }

    void temperatureUp() {
        ++temperature;
    }

    void temperatureDown() {
        --temperature;
    }

}

public class ElectronicTest {
    public static void main(String[] args) {
        Electronic1 elec1 = new Electronic1();
        Electronic1 elec2 = new Electronic1();

        System.out.println("elec1 : " + elec1.temperature);
        System.out.println("elec2 : " + elec2.temperature);

        elec1.temperature = 100;
        elec2.temperature = 200;

        System.out.println("elec1 : " + elec1.temperature);
        System.out.println("elec2 : " + elec2.temperature);

    }
}
