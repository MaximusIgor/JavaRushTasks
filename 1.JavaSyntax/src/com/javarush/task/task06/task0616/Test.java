package com.javarush.task.task06.task0616;

/*
Быстрая (статическая) инициализация. Сумма элементов массива
 */

public class Test {
    public static void main(String[] args) {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("Sum is " + sum);
    }
}