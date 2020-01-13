package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String Title;
    protected final int duration;

    public Task(String title, int duration) {
        Title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return Title;
    }

    public final int getDuration() {
        return duration;
    }
}