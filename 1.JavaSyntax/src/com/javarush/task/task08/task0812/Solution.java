package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
//        int tmp = 0, record = 0;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    tmp++;
//                } else {
//                    if(tmp > record) record=tmp;
//                    tmp = 0;
//                }
//            }
//        }
//        System.out.println(record);
        int max = 1;
        for (int i = 0; i < list.size(); i++) {
            int n = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    n = n + 1;
                    if (n > max) max = n;
                }
                else break;
            }
        }
        System.out.print(max);
    }
}