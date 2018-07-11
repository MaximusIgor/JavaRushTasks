package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/


public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 1;


        while (x <= 10) {
            int i = 1;
            while (i <= 10) {

                System.out.print(x * i + " ");
                i++;
            }

            System.out.println();
            x++;
        }
    }
}
