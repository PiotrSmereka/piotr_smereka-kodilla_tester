package com.kodilla.inheritance.homework;

public class SystemTest {
    public static void main(String[] args) {
        Windows windows = new Windows(2007);
        windows.turnOn();
        windows.turnOff();
        windows.displaySystemYear();

        Linux linux = new Linux (2009);
        linux.turnOn();
        linux.turnOff();
        linux.displaySystemYear();
    }
}
