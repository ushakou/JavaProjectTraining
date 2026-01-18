package com.javaprojecttraining.lesson13.task1;

/*
Задача 1:
Создать класс, в котором будет статический метод. Этот метод принимает на вход три
параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
password должна быть меньше 20 символов, не должен содержать пробелом и должен
содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить
WrongPasswordException. WrongPasswordException и WrongLoginException -
пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны, false в противном случае.
*/

public class Task1 {
    public static void main(String[] args) {

        String login = "username";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            controller(login, password, confirmPassword);
            System.out.println("Данные корректны.");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static boolean controller(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        //Checking login
        if (login == null || login.length() >= 20 || login.length() < 1 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть короче 20 символов и не содержать пробелы.");
        }

        //Checking password
        if (password == null || password.length() >= 20 || login.length() < 1 || password.contains(" ") ||
                !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен быть короче 20 символов, не содержать пробелы и иметь хотя бы одну цифру.");
        }

        //Password matching check
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }

        return true;
    }
}


