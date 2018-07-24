package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите тут ваш код

        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (a > maximum) {
                    maximum = a;
                } else {
                    maximum = maximum;
                }
            }
        }
        System.out.println(maximum);
    }
}