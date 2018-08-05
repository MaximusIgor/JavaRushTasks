package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20];
        int[] small = new int[10];
        int[] small1 = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            small[i] = arr[i];
            small1[i] = arr[i + 10];
            System.out.println(small1[i]);
        }
    }
}