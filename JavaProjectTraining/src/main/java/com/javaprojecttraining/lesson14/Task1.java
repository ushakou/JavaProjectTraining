package com.javaprojecttraining.lesson14;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String inputPath = "D:\\text.txt";
        String outputPath = "D:\\newtext.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            StringBuilder textBuilder = new StringBuilder();
            String line;

            //Reading the text line by line
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append(" ");
            }

            //Highlighting words
            String text = textBuilder.toString();
            String[] words = text.split("[\\p{Punct}\\s]+");

            //Finding the longest word
            String longestWord = "";
            for (String word : words) {
                if (!word.isEmpty() && word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            //Check for the presence of words
            if (longestWord.isEmpty()) {
                System.out.println("В файле нет слов.");
                return;
            }

            //Writing the result to a new file
            writer.write(longestWord);

            System.out.println("Записано самое длинное слово: '" + longestWord + "' в файл: " + outputPath);

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка чтения файла. Файл отсутствует.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}