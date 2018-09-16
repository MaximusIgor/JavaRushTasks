package com.javarush.task.task04.task0439;

public class Test2 {
    public static void main(String[] args) {
        {
            int x = 5;
            {
                x = 10;
                System.out.println(x);
            }
        }
    }
}