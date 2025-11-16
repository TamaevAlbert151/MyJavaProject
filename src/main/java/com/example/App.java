package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Task Manager!");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Учебное задание на Java");
        taskManager.printTasks();
    }
}
