package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        int maxLength = 0;


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);

            for (int a = 0; a < strings.size(); a++) {
                if (maxLength < strings.get(i).length()) {
                    maxLength = strings.get(i).length();
                } else {
                    break;
                }
            }

            for (int b = 0; b < strings.size(); b++) {
                if (maxLength == strings.get(b).length()) {
                    System.out.println(strings.get(b));
                }
            }
        }
    }
}