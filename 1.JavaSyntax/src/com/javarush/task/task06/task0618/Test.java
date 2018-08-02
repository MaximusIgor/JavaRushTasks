package com.javarush.task.task06.task0618;

/*
Ввод 10 строк с клавиатуры и вывод на экран
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] list = new String[10];

        for (int i = 0; i <list.length ; i++) {
            list[i] = reader.readLine();
            System.out.println(list[i]);
        }
    }
}