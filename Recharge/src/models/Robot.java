package models;

import interfaces.IRechagreable;

public class Robot extends Worker implements IRechagreable {

    private int capacity;
    private int currentPower;

    public Robot(String id , int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    @Override
    public void Work(int hours) {
        if(hours>currentPower){
            hours = currentPower;
        }
        super.Work(hours);
        this.currentPower -= hours;
    }


    @Override
    public void recharge() {
        this.currentPower = this.capacity;
    }
}
