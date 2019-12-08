package com.kodilla.abstracts.homework;

public class Miner extends Job {
    public Miner() {
        super("Miner",90000, "Getting gold");
    }
    @Override
    public void displayJobTitle() {
        System.out.println(getJobTitle());
    }
    @Override
    public void displayResponsibilities() {
        System.out.println(getResponsibilities());
    }
    @Override
    public void displaySalary() {
        System.out.println(getSalary());
    }
}

