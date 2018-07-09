package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int year = Integer.parseInt(s);

        String days = "количество дней в году: ";
        int x = 365;
        int y = 366;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(days + y);
        } else
            System.out.println(days + x);
    }
}