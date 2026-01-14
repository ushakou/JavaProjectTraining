package com.javaprojecttraining.lesson1;

/*
Задача *:
Написать программу которая будет менять местами значение целочисленных
переменных. Пример:
int a = 1; int b = 2;
//код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
*/

public class TaskBonus {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int[] arr = {a, b};
        a = arr[1];
        b = arr[0];

        System.out.println(a);
        System.out.println(b);
    }
}
