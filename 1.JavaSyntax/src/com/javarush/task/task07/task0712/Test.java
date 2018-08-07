package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();


        while (true){
            String s = reader.readLine();
            if(s.isEmpty()){
                list.add(Integer.parseInt(s));
            }
            System.out.println(s);
        }
    }
}