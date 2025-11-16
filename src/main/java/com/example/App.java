package com.example;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Перенаправляем System.out в UTF-8
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("Добро пожаловать в Task Manager!");
        System.out.println("Список задач:");
        System.out.println("- Учебное задание на Java");
    }
}
