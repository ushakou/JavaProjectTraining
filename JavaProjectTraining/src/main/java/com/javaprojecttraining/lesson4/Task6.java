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

public class Task6 {
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

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите значение для элемента массива " + i + " :");
            array[i] = scanner.nextInt();
        }

        scanner.close();

//        Задача 6:
//        Проверить, является ли массив возрастающей последовательностью (каждое следующее
//        число больше предыдущего).

        System.out.println("Имеем массив: " + Arrays.toString(array));

        boolean isTrue = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
            } else {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }
    }
}
