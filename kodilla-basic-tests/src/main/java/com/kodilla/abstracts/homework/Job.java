package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;
    private String jobTitle;

    public Job(String jobTitle,int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.jobTitle = jobTitle;
    }
    public int getSalary() {
        return salary;
    }
    public String getResponsibilities(){
        return responsibilities;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public abstract void displayJobTitle();
    public abstract void displayResponsibilities();
    public abstract void displaySalary();
}



