package com.techreturners.cats;

public class DomesticCat implements Cat {
    final int AverageHeight = 23;
    private boolean isAwake = true;

    public boolean isAsleep() {
        return !this.isAwake;
    }

    public void goToSleep() {
        this.isAwake = false;
    }

    public void wakeUp() {
        this.isAwake = true;
    }

    public String getSetting() {
        return "domestic";
    }

    public int getAverageHeight() {

        return AverageHeight;
    }

    public String eat() {

        return "Purrrrrrr";
    }

}