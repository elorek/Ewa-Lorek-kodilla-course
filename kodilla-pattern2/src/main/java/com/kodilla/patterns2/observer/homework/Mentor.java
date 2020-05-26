package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(TasksLine tasksLine) {
        System.out.println(name + ", there is a new task. " + "\n" + "total : " + tasksLine.getTasks().size() + " tasks");
        updateCount++;
    }
}
