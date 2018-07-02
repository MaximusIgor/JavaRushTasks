package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(123, 435));
        System.out.println(convertEurToUsd(3500, 32));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double usd;
        return usd = eur * course;
    }
}
