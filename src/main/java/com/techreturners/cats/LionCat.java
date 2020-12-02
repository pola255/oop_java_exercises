package com.techreturners.cats;

public class LionCat implements Cat {
    final int AverageHeight = 1100;

    public int getAverageHeight() {

        return AverageHeight;
    }
    public String eat() {

        return "Roar!!!!";
    }
    @Override
    public boolean isAsleep() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void goToSleep() {
        // TODO Auto-generated method stub

    }
    @Override
    public void wakeUp() {
        // TODO Auto-generated method stub
    }
    @Override
    public String getSetting() {
        // TODO Auto-generated method stub
        return null;
    }
}