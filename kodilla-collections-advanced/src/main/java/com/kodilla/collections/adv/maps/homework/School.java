package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class School {
   private String schoolName;

    private List<Integer> pupilsInClass = new ArrayList<>();

    public School (String schoolName, int ... pupilsInClass) {
        for (int pupils : pupilsInClass)
            this.pupilsInClass.add(pupils);
            this.schoolName = schoolName;
    }

    public int getAllPupils() {
        int sum =0;
        for (int pupils : pupilsInClass)
            sum += pupils;
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(pupilsInClass, school.pupilsInClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, pupilsInClass);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getPupilsInClass() {
        return pupilsInClass;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", pupilsInClass=" + pupilsInClass +
                '}';
    }
}
