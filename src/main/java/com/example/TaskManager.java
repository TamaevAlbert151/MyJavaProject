package com.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void printTasks() {
        System.out.println("Список задач:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
