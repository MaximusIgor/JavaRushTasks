package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> secondary1 = new ArrayList<Integer>();
        ArrayList<Integer> secondary2 = new ArrayList<Integer>();
        ArrayList<Integer> secondary3 = new ArrayList<Integer>();

        // выводим на экран элементы списков
        printList(secondary1);
        printList(secondary2);
        printList(secondary3);

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                secondary1.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                secondary2.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
                secondary3.add(list.get(i));
            }
        }
    }


    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(list.get(i));
        }
    }
}