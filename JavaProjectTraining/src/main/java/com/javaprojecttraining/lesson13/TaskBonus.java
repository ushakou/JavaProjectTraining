package com.javaprojecttraining.lesson13;

/*
Задача *:
Написать try/catch/finally, в котором finally вызван не будет.
*/

public class TaskBonus {
    public static void main(String[] args) {
        try {
            while (true) {
                Thread.sleep(5000);
                System.out.println("Бесконечный цикл");
            }
        } catch (Exception e) {
        } finally {
            System.out.println("finally блок");
        }
    }
}