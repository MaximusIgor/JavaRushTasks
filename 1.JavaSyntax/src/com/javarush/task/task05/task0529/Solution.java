package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (int i = 0; ; i++) {

            String a = reader.readLine();

            if (a.equals("Сумма")) {
                break;
            }
            int x = Integer.parseInt(a);
            sum += x;
        }
        System.out.println(sum);
    }
}