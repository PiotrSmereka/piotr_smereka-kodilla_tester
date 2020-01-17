package com.kodilla.stream.optional.homework;

public class Teacher {
    String name;

    public String getName() {
        return name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher :" + name;
    }
}
