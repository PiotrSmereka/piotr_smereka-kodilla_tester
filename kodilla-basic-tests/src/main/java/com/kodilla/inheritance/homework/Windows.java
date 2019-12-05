package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows (int systemYear){
        super(systemYear);
    }
    @Override
    public void turnOn(){
        System.out.println("Windows operating system has been turned on last Monday");
    }
    @Override
    public void turnOff(){
        System.out.println("Windows operating system has been turned off last Saturday");
    }
}

