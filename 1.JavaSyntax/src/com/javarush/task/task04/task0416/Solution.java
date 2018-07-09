package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // String s = bufferedReader.readLine();
        double t = Double.parseDouble(bufferedReader.readLine());
        t%=5;

        if (t >= 0.0 && t < 3.0){
            System.out.println("зелёный");
        }else if (t >= 3.0 && t < 4.0){
            System.out.println("жёлтый");
        }else if (t >= 4.0 && t <= 5.0 ){
            System.out.println("красный");
        }
    }
}