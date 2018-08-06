package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList <String>();
        String s ;

        for (int i = 0; i < 5 ; i++) {
            String str = reader.readLine();
            list.add(str);
        }

        for (int i = 0; i < 13 ; i++) {
            s = list.get(4);
            list.remove(4);
            list.add(0,s);
        }

        for(int i =0; i<5; i++)  {
            System.out.println(list.get(i));
        }
    }
}