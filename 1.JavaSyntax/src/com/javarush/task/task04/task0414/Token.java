package com.javarush.task.task04.task0414;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Token {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            Scanner scanner = new Scanner(file);
            // обрабатываем файл пока в нем еще есть токен
            // в данном случае - есть ли новая строка
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // печатаем построчно
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}