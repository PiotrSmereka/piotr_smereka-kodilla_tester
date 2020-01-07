package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private int speed;
    public Fiat (int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void increaseSpeed() {
        speed += 12;
    }
    public void decreaseSpeed() {
        speed -= 10;
    }
}
