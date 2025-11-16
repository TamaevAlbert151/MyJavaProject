package com.example;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Принудительно устанавливаем System.out в UTF-8
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("Welcome Task Manager!");
        System.out.println("Task list:");
        System.out.println("- Learning assignment in Java");
    }
}
