package com.javaprojecttraining.lesson1;

/*
Задача 1:
Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
*/

public class Task1 {
    public static void main(String[] args) {
        int b = 15;
        int c = 17;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }
}
