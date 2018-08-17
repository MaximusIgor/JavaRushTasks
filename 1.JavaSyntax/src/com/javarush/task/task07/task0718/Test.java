package com.javarush.task.task07.task0718;

//Копирование элементов одного массива в другой

public class Test {
    public static void main(String[] args) {
        int[] smailPrimes = {2, 3, 5, 7, 11, 13};
        int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        System.arraycopy(smailPrimes,2,luckyNumbers,3,4);
        for (int i = 0; i < luckyNumbers.length ; i++) {
            System.out.println(i + ": " + luckyNumbers[i]);
        }
    }
}