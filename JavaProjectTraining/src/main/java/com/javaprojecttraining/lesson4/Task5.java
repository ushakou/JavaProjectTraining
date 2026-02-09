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

public class Task5 {
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
            array[i] = (int) (Math.random() * 10);
        }

//        Задача 5:
//        Пройти по массиву и поменять местами элементы первый и последний, второй и
//        предпоследний и т.д

        System.out.println("Имеем массив: " + Arrays.toString(array));

        if (array.length > 1) {
            int count = 1;
            for (int i = 0; i < array.length / 2; i++) {
                int a = array[i];
                int b = array[array.length - count];
                array[i] = b;
                array[array.length - count] = a;
                count++;
            }

            System.out.println("Измененный массив: " + Arrays.toString(array));

        } else {
            System.out.println("Извините, с массивом размером 1 реверс значений невозможен.");
        }
    }
}
