package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];

        int sumE = 0;
        int sumNE = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0) {
                sumE += arr[i];
            } else if (i % 2 != 0) {
                sumNE += arr[i];
            }
        }
        System.out.println(sumE > sumNE ? "В домах с четными номерами проживает больше жителей." :
                "В домах с нечетными номерами проживает больше жителей.");
    }
}