package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> vocabulary = new HashMap<>();
        vocabulary.put("Shylov", 1000000);
        vocabulary.put("Ivanov", 500);
        vocabulary.put("Petrov", 450);
        vocabulary.put("Sidorov", 300);
        vocabulary.put("Soroka", 600);
        vocabulary.put("Semenov", 800);
        vocabulary.put("Pupkin", 120);
        vocabulary.put("Sokol", 100);
        vocabulary.put("Shmidt", 1000);
        vocabulary.put("Borisov", 210);

        return (HashMap<String, Integer>) vocabulary;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}