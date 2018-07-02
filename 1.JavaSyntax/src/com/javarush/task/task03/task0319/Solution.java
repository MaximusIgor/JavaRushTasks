package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем данные с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем данные с клавиатуры
        String nAge = bufferedReader.readLine(); //читаем данные с клавиатуры
        System.out.println(name + " получает " + sAge + " через " + nAge + " лет.");// выводим на экран
    }
}
