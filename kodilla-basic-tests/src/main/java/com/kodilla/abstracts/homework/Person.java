package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public void displayJobTitle(){
    System.out.println("Job title: " + job.getJobTitle());
    }
    public void displaySalaryAndResponsibilities() {
        System.out.println("Salary: " + "$"+ job.getSalary());
        System.out.println("Responsibilities: " +job.getResponsibilities());
    }
    public static void main(String[] args) {
        Job electrician = new Electrician();
        Person person1 = new Person("Rick", 25, electrician);

        Job mechanic = new Mechanic();
        Person person2 = new Person("Alan", 30, mechanic);

        Job miner = new Miner();
        Person person3 = new Person("Frank", 27, miner);

        System.out.println("Employee name: " + person1.getFirstName());
        System.out.println("Employee age: " + person1.getAge());
        person1.displayJobTitle();
        person1.displaySalaryAndResponsibilities();

        System.out.println("Employee name: " + person2.getFirstName());
        System.out.println("Employee age: " + person2.getAge());
        person2.displayJobTitle();
        person2.displaySalaryAndResponsibilities();

        System.out.println("Employee name: "+ person3.getFirstName());
        System.out.println("Employee age: "+ person3.getAge());
        person3.displayJobTitle();
        person3.displaySalaryAndResponsibilities();
    }
}
