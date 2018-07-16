package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double count = 0;
        double entrys = 0;

        while (true) {
            double  x = Double.parseDouble(reader.readLine());
            if (x != -1.0) {
                count = count + x;
                entrys++;
            } else {
                break;
            }
        }
        System.out.println(count/entrys);
    }
}

