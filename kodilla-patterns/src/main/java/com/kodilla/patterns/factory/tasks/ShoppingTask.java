package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public String executeTask() {
        return "The shopping task is being executed...";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean approved = false;
        if(approved == true) {
            System.out.println("The task has been executed.");
            return true;
        } else {
            System.out.println("The task has not been executed.");
            return false;
        }
    }
}
