package com.javarush.task.task04.task0414;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.println(getMinValue(4, 10));

        System.out.println(getAbsoluteValue(-10));

        System.out.println(invertBoolean(true));

        String str = "Austria";
        String data = str.contains("A") ? "Str содержит букву 'A'" : "Str не содержит букву 'A'";
        System.out.println(data);

        int i = 10;
        switch (i) {
            case 5:
                System.out.println("i=5");
                break;
            case 10:
                System.out.println("i=10");
                break;
            default:
                System.out.println("i не равно 5 или 10");
        }
        System.out.println((i == 5) ? "i=5" : ((i == 10) ? "i=10" : "i не равно 5 или 10"));
    }

    // инвертирует булевое значение:
    // если b == true, то возвращает false, иначе возвращает true
    private static boolean invertBoolean(boolean b) {
        return b ? false : true;
    }

    private static int getAbsoluteValue(int i) {
        return i < 0 ? -i : i;
    }

    private static int getMinValue(int i, int j) {
        return (i < j) ? i : j;
    }
}