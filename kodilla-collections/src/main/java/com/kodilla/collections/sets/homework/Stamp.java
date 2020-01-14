package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private boolean stamped;

    public Stamp(String stampName, double stampHeight, double stampWidth, boolean stamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.getStampHeight(), getStampHeight()) == 0 &&
                Double.compare(stamp.getStampWidth(), getStampWidth()) == 0 &&
                isStamped() == stamp.isStamped() &&
                Objects.equals(getStampName(), stamp.getStampName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampHeight(), getStampWidth(), isStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", stamped=" + stamped +
                '}';
    }
}

