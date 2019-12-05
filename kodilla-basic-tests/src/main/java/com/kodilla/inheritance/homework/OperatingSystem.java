package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int systemYear;

    public OperatingSystem(int systemYear) {
        this.systemYear = systemYear;
    }

    public void turnOn() {
        System.out.println("Operating system has been turned on");
    }

    public void turnOff() {
        System.out.println("Operating system has been turned off");
    }

    public int getSystemYear() {
        return systemYear;
    }

    public void displaySystemYear() {
        System.out.println("Above operating system released in" + " " + systemYear);
    }
}
