package com.javaprojecttraining.lesson1;

/*
Задача 3:
В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
9 (1+2+6).
*/

public class Task3 {
    public static void main(String[] args) {
        int n = 126;
        int firstDigit = n / 100;
        int secondDigit = (n / 10) % 10;
        int thirdDigit = n % 10;
        int summ = firstDigit + secondDigit + thirdDigit;
        System.out.println(summ);
    }
}
