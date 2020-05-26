package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksLine implements Observable {
    private final List<Mentor> mentors;
    private final List<String> tasks;

    public TasksLine() {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void subscribeMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for(Mentor mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {
        mentors.remove(mentor);
    }
}
