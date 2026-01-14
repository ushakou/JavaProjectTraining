package com.javaprojecttraining.lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Задача 1:
Вывести в консоль из строки которую пользователь вводит с клавиатуры все
аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
только из прописных букв, без чисел.*/

public class Lesson12Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        while (str == null || str.trim().isEmpty()) {
            System.out.println("Вы ввели пустую строку, введите новую");
            str = scanner.nextLine();
        }

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b");
        Matcher matcher = pattern.matcher(str);

        boolean isMatch = false;

        while (matcher.find()) {
            System.out.println("Аббревиатура: " + matcher.group());
            isMatch = true;
        }

        if (!isMatch) {
            System.out.println("Аббревиатур не найдено");
        }

        scanner.close();
    }
}
