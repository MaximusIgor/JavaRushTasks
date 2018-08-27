package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySortsByMethods {
    public static void main(String[] args) throws IOException {
        final int[] arr = new int[4];

        dataInput(arr);
        insertionSorting(arr); // сортировка вставками
        sortingBubble(arr); // сортировка пузырьком
        selectionSorting(arr); // сортировка выборкой
    }

    // заполнение массива данными с клавиатуры

    public static void dataInput(int[] ints) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            System.out.print("Введите число: ");
            ints[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println();
        System.out.println("Исходный массив: " + Arrays.toString(ints));
    }


    // сортировка вставками с пошаговым выводом на экран

    public static void insertionSorting(int[] ints) {

        System.out.println("Сортировка вставками");

        for (int k = 1; k < ints.length; k++) {
            int newElement = ints[k];
            int location = k - 1;
            while (location >= 0 && ints[location] > newElement) {
                ints[location + 1] = ints[location];
                location--;
            }
            ints[location + 1] = newElement;
            System.out.println(Arrays.toString(ints));
        }
    }

    // сортировка пузырьком с пошаговым выводом на экран

    public static void sortingBubble(int[] ints) {
        System.out.println("Сортировка пузырьком");

        int tmp;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
                if (ints[j] < ints[j + 1]) {
                    tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                    System.out.println(Arrays.toString(ints));
                }
            }
        }
    }

    // сортировка выборкой с пошаговым выводом на экран

    public static void selectionSorting(int[] ints) {
        System.out.println("Сортировка выборкой");
        int tmp;
        int i = 0;
        int j = ints.length - 1;
        while (j > i) {
            tmp = ints[j];
            ints[j] = ints[i];
            ints[i] = tmp;
            j--;
            i++;
            System.out.println(Arrays.toString(ints));
        }
    }
}