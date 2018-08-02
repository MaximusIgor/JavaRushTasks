package com.javarush.task.task06.task0617;

/*
Ввод 10 чисел с клавиатуры
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int [10];

        for (int i = 0; i <list.length ; i++) {
            list[i] = Integer.parseInt(reader.readLine());
            System.out.println(list[i]);
        }
    }
}