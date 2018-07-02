package com.javarush.task.task01.task0133;

/* Пример программы, которая выведет на экран индексы всех
 пробелов в строке, введенноё пользователем с клавиатуры */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(i);
            }
        }
    }
}
