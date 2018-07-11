package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int positiveCount = 0;
        int negativeCount = 0;

        if (a > 0) {
            positiveCount++;
        } else if (a < 0) {
            negativeCount++;
        }
        if (b > 0) {
            positiveCount++;
        } else if (b < 0) {
            negativeCount++;
        }
        if (c > 0) {
            positiveCount++;
        } else if (c < 0) {
            negativeCount++;
        }
        System.out.println("количество положительных чисел: " + positiveCount);
        System.out.println("количество отрицательных чисел: " + negativeCount);
    }
}