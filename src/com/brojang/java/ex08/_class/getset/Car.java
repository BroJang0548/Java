package com.brojang.java.ex08._class.getset;

public class Car {
    //fields
    private int speed;
    private boolean stop;

    //getters and setters
    public int getSpeed() {
        return speed;
    }

    // set methods
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    //stop methods
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop) {
            this.speed = 0;
        }
    }
}
