package com.javaprojecttraining.lesson2;

/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное число. А
программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
ввести некорректные данные.
 */

import java.util.Scanner;

public class TaskBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число:");

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не целое число.");
        } else {
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Число должно быть положительным.");
            } else {
                int summ = 0;
                for (int i = 1; i <= num; i++) {
                    summ = summ + i;
                }
                System.out.println(summ);
            }
        }

        scanner.close();
    }
}