package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Oscar Wide");
        Teacher teacher2 = new Teacher("Martin Ferguson");
        Teacher teacher = new Teacher("");


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", teacher1));
        studentList.add(new Student("Robert", null));
        studentList.add(new Student("Eva", teacher2));
        studentList.add(new Student("Maria", null));


        for (Student student : studentList) {
            Optional<String> optionalTeacher = Optional.ofNullable(student.getTeacher().getName());
            System.out.println("Student :" + student.getName() + ", " + optionalTeacher.orElse(new Teacher("undefined").getName()));
        }
    }
    }



