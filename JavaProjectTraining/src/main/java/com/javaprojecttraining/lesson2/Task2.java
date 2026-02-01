package com.javaprojecttraining.lesson2;

/*
Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите числовое значение температуры на улице:");

        if (console.hasNextInt()) {

            int t = console.nextInt();

            if (t > -5) {
                System.out.println("Warm");
            } else if (-5 >= t && t > -20) {
                System.out.println("Normal");
            } else if (-20 >= t) {
                System.out.println("Cold");
            }
        } else {
            System.out.println("Вы ввели не число.");
        }

        console.close();
    }
}