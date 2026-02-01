package com.javaprojecttraining.lesson2;

/*
Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на выход
будет выводить сообщение четное число или нет. Для определения четности числа
используйте операцию получения остатка от деления (операция выглядит так: '% 2').
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число:");

        if (console.hasNextInt()) {

            int num = console.nextInt();

            if (num % 2 == 0) {
                System.out.println("Вы ввели четное число.");
            } else {
                System.out.println("Вы ввели нечетное число.");
            }
        } else {
            System.out.println("Вы ввели не число.");
        }

        console.close();
    }
}