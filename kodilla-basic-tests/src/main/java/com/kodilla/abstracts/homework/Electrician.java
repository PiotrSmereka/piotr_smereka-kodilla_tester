package com.kodilla.abstracts.homework;

public class Electrician extends Job{
    public Electrician() {
        super("Electrician",10000, "Maintenance of MV & HV network");
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
