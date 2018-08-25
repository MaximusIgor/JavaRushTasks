package com.javarush.task.task07.task0728;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}