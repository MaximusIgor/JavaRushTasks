package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/


import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar date = Calendar.getInstance();

        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH) + 1;
        int year = date.get(Calendar.YEAR);

        System.out.println(day + " " + month + " " + year);
    }
}