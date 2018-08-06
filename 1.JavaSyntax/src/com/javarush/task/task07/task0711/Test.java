package com.javarush.task.task07.task0711;

public class Test {
    public static void main(String[] args) {

        String s = "----------";
        char[] m = s.toCharArray();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < m.length; j++)
                System.out.print(m[j] + " ");
            System.out.println();
        }
    }
}