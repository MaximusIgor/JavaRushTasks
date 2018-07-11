package com.javarush.task.task04.task0425;

public class Test {
    public static void main ( String []args ) {
        System.out.println(isALessThenB(1, 3));
        System.out.println(isALessThenB(3, 1));
    }

    public static boolean isALessThenB(int a, int b)
    {
        if (a < b)
            return true;
        else
            return false;
    }

}
