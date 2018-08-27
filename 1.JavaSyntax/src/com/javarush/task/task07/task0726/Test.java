package com.javarush.task.task07.task0726;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int m = 11;
        int n = 28;
        c.set(Calendar.MONTH, (m - 1));
        c.set(Calendar.DAY_OF_MONTH, n);
        //c.add(Calendar.DAY_OF_YEAR, -1);

        System.out.println(c.getTime());
    }
}
