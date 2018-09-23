package com.javarush.task.task08.task0815;

import java.util.HashMap;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            map.put("FirstName" + i, "LastName");
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value: map.values()){
            if (value.equals(name)) count ++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        if (map.containsKey(lastName)) return 1;
        return 0;
    }

    public static void main(String[] args) {


    }
}