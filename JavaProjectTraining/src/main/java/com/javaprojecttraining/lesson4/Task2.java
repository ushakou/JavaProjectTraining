package com.javaprojecttraining.lesson4;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Введите простое целое положительное число:");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    System.out.println("Вы ввели число " + number + ", это будет длина нашего массива.");
                    valid = true;
                }
            } else {
                scanner.next();
            }
        }

        scanner.close();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

//        Задача 2:
//        Найти минимальный-максимальный элементы и вывести в консоль.

        System.out.println("Имеем массив: " + Arrays.toString(array));

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }
}
