package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(reader.readLine());
        }

        // Вывести на экран result
        ArrayList<String> result = doubleValues(list);
        for (String res : result) {
            System.out.println(res);
        }

    }

   public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i = 0; i <list.size(); i = i + 2){

            list.add(i + 1, list.get(i));
        }
        return list;
    }
}