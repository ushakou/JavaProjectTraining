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

public class TaskBonus {
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

            boolean valid2 = false;
            int num = 0;

            while (!valid2) {
                System.out.println("Введите простое целое положительное число для элемента массива " + i + " :");

                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    if (num >= 0) {
                        array[i] = num;
                        valid2 = true;
                    }
                } else {
                    scanner.next();
                }
            }
        }

        scanner.close();

        /*
        Задача *:
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        содержит нуля в начале, кроме самого числа 0.
        Пример:
        Input: [1,4,0,5,6,3]
        Output: [1,4,0,5,6,4]
        Input: [9,9,9]
        Output: [1,0,0,0]
         */

        System.out.println("Имеем массив: " + Arrays.toString(array));

        String count = "";

        for (int i = 0; i < array.length; i++) {
            count = count + array[i];
        }

        int summ = Integer.parseInt(count);

        summ = summ + 1;

        String countNew = summ + "";

        int[] arrayNew = new int[countNew.length()];

        for (int i = 0; i < countNew.length(); i++) {
            arrayNew[i] = Character.getNumericValue(countNew.charAt(i));
        }

        System.out.println("Новый массив: " + Arrays.toString(arrayNew));
    }
}
