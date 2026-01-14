package com.javaprojecttraining.lesson1;

/*
Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
на экран результат деления q на w с остатком. Пример вывода программы (для случая,
когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
*/

public class Task5 {
    public static void main(String[] args) {
        int q = 21;
        int w = 8;
        int divided = q / w;
        int remainder = q % w;
        System.out.println(q + " / " + w + " = " + divided + " и " + remainder + " в остатке.");
    }
}
