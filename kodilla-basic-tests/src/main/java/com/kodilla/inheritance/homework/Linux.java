package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    public Linux (int systemYear){
        super(systemYear);
    }
    @Override
    public void turnOn(){
        System.out.println("Linux operating system has been turned on last Wednesday");
    }
    @Override
    public void turnOff(){
        System.out.println("Linux operating system has been turned off last Friday");
    }
}

