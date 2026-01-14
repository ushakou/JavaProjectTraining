package com.javaprojecttraining.lesson1;

/*
Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
программу, округляющую число n до ближайшего целого и выводящую результат на
экран.
*/

public class Task4 {
    public static void main(String[] args) {
        double n = 1.987;
        long rounded = Math.round(n);
        System.out.println(rounded);
    }
}