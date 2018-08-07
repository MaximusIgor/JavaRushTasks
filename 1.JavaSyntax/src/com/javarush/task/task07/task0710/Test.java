package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }

            int x = Integer.parseInt(s);
            if(x % 2 == 0){
                list.add(x);
            }else {
                list.add(0, x);
            }
            System.out.println(list.size());
        }

    }
}