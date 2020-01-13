package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalSchool = new HashMap<>();
        Principal john = new Principal ("John", "Stevenson");
        Principal kevin = new Principal ("Kevin", "Nolan");
        Principal alan = new Principal ("Alan", "Bol");

        School johnSchool = new School ("Crescent International School",28 , 25, 30, 24);
        School kevinSchool = new School ("Modern Private School", 10, 12, 14, 14);
        School alanSchool = new School ("Bright Riders School", 25, 23, 26, 24);

        principalSchool.put (john, johnSchool);
        principalSchool.put (kevin, kevinSchool);
        principalSchool.put (alan, alanSchool);

        for (Map.Entry<Principal, School> principalEntry : principalSchool.entrySet())
            System.out.println("Principal: " + principalEntry.getKey().getFirstname() + " " +
                    principalEntry.getKey().getLastname() + ", School Name: " + principalEntry.getValue().getSchoolName() +
                    ", Total pupil numbers: " + principalEntry.getValue().getAllPupils());
    }
}
