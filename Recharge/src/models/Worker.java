package models;

import interfaces.ISleeper;

public abstract class Worker {
    private String id;
    private int workingHours;

    public Worker(String id) {
        this.id = id;
    }

    public void Work(int hours){
        workingHours += hours;
    }
}
