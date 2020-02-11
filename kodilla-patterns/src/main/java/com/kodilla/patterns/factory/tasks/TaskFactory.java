package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Take a trip", "by the river", "a bike");
            case PAINTING:
                return new PaintingTask("How to paint lesson", "blue", "sky");
            case SHOPPING:
                return new ShoppingTask("Buy", "armchair", 2);
            default:
                return null;
        }
    }
}
