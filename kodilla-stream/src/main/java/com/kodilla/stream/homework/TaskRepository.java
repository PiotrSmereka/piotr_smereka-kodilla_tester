package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Digging", LocalDate.of(2019,12,5), LocalDate.of(2019,12,11)));
        tasks.add(new Task("Welding", LocalDate.of(2019,12,12), LocalDate.of(2020,1,19)));
        tasks.add(new Task("Refilling", LocalDate.of(2020,1,20), LocalDate.of(2020,2,3)));
        return tasks;
    }
}
