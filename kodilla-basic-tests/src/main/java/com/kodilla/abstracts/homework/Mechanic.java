package com.kodilla.abstracts.homework;

public class Mechanic extends Job {
    public Mechanic() {
        super("Mechanic", 34000, "Van fleet repairs");
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
