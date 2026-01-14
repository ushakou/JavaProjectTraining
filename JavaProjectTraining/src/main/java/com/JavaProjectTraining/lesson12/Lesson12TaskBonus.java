package com.javaprojecttraining.lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Задача *:
Программа на вход получает произвольный текст. В этом тексте может быть номер
документа(один или несколько), емейл и номер телефона. Номер документа в формате:
xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
может содержать не всю информацию, т.е. например, может не содержать номер
телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
формате:
email: teachmeskills@gmail.com
document number: 1423-1512-51
и т.д.*/

public class Lesson12TaskBonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = scanner.nextLine();

        while (str == null || str.trim().isEmpty()) {
            System.out.println("Вы ввели пустой текст, введите новый");
            str = scanner.nextLine();
        }

        String documentNumberRegex = "\\d{4}-\\d{4}-\\d{2}\\b";
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String phoneNumberRegex = "\\+\\(\\d{2}\\)\\d{7}";

        boolean isMatch = false;

        //Search document number
        Pattern docPattern = Pattern.compile(documentNumberRegex);
        Matcher docMatcher = docPattern.matcher(str);
        while (docMatcher.find()) {
            System.out.println("Document number: " + docMatcher.group());
            isMatch = true;
        }

        //Search email
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(str);
        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
            isMatch = true;
        }

        //Search phone number
        Pattern phonePattern = Pattern.compile(phoneNumberRegex);
        Matcher phoneMatcher = phonePattern.matcher(str);
        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
            isMatch = true;
        }

        if (!isMatch) {
            System.out.println("Заданной информации не найдено");
        }

        scanner.close();
    }
}
