package com.javarush.task.task07.task0726;

import java.util.Scanner;

public class WeightOfPeople {
    static final int ORDINARY_PEOPLE = 1;
    static final int FAT_PEOPLE = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeOfGroup = 0;

        while (sizeOfGroup <= 0) {//Safely get size of group
            System.out.printf("Введите кол-во человек в группе: ");
            sizeOfGroup = Math.round(checkSyntaxSetValue());
        }

        float[] eachHuman = new float[sizeOfGroup];//Here will be stored weight of group members

        for (int i = 0; i < eachHuman.length; i++) {
            System.out.printf("Ведите вес человека %d из группы: ", i + 1);
            eachHuman[i] = checkSyntaxSetValue();
            if (eachHuman[i] <= 0) {
                System.err.println("***********************************************\n"
                        + "Syntax error. Please enter weight(kg) of each group member from beginning."
                        + "\n***********************************************");
                i = -1;
            } else if (i == eachHuman.length - 1 && !hasFatHuman(eachHuman)) {
                System.err.println("***********************************************\n"
                        + "По крайней мере, один член группы должен быть тяжелее 100 кг. \n"
                        + "Пожалуйста, введите вес каждого человека с самого начала.\n"
                        + "***********************************************");
                i = -1;
            }
        }

        System.out.printf("\nСреднее число простых людей\n :%.1f", calcAverageOfPeople(eachHuman, ORDINARY_PEOPLE));
        System.out.printf("\nAverage of fat people is :%.1f", calcAverageOfPeople(eachHuman, FAT_PEOPLE));

        System.out.printf("\n\n\n TEST AREA TEST AREA TEST AREA TEST AREA\n\n");

        System.out.println("\n**********************************************\nTesting part. Method testHasFatHuman\n");
        testHasFatHuman();

        System.out.println("\n\n**********************************************\nTesting part. Method testCalcAverageOfPeople_FatPeople\n");
        testCalcAverageOfPeople_FatPeople();

        System.out.println("\n\n**********************************************\nTesting part. Method testCalcAverageOfPeople_OrdinaryPeople\n");
        testCalcAverageOfPeople_OrdinaryPeople();

        System.out.println("\n\n**********************************************\nTesting part. Method testCalcAverageOfPeople_OnlyFatPeople\n");
        testCalcAverageOfPeople_OnlyFatPeople();
    }

    private static float calcAverageOfPeople(float[] eachHuman, int operation) {
        float sumOfWeight = 0;
        int counter = 0;

        for (int i = 0; i < eachHuman.length; i++) {
            switch (operation) {
                case ORDINARY_PEOPLE:
                    if (eachHuman[i] <= 100) {
                        sumOfWeight += eachHuman[i];
                        counter++;
                    }
                    break;

                case FAT_PEOPLE:
                    if (eachHuman[i] > 100) {
                        sumOfWeight += eachHuman[i];
                        counter++;
                    }
            }
        }
        return sumOfWeight / (float) counter;
    }

    private static boolean hasFatHuman(float[] eachHuman) {
        for (int i = 0; i < eachHuman.length; i++) {
            if (eachHuman[i] > 100) return true;
        }
        return false;
    }

    public static float checkSyntaxSetValue() {
        float value = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            value = sc.nextFloat();
        } else if (value <= 0) return 0;
        else {
            sc.next();
            return 0;
        }
        return value;
    }


    //Test methods


    public static void testHasFatHuman() {//Test of mixed group ordinary and fat people. Test will answer "OK" if at least 1 member is heavier than 100kg
        float[] data = {97, 98, 99, 100, (float) 100.1, 101};
        boolean expectedResults = true;

        if (hasFatHuman(data) == expectedResults)
            System.out.printf("testHasFatHuman method Test successful!\nTested method result = %b, expected result = %b", hasFatHuman(data), expectedResults);
        else System.out.println("Error");
    }

    public static void testCalcAverageOfPeople_FatPeople() {//Group of mixed ordinary and fat people. Method sort out fat people
        float[] data = {131, 29, 145, 2, 104, 122, 85, 26, 44, 111, 79};

        float expectedResults = (float) 122.6;

        if (calcAverageOfPeople(data, FAT_PEOPLE) == expectedResults)
            System.out.printf("testCalcAverageOfPeople_FatPeople method Test successful!\nTested method result = %f, expected result = %f", calcAverageOfPeople(data, 2), expectedResults);
        else System.out.println("Error");
    }

    public static void testCalcAverageOfPeople_OrdinaryPeople() {//Group of mixed ordinary and fat people. Method sort out ordinary people
        float[] data = {131, 29, 145, 2, 104, 122, 85, 26, 44, 111, 79};

        float expectedResults = (float) 44.16666667;

        if (calcAverageOfPeople(data, ORDINARY_PEOPLE) == expectedResults)
            System.out.printf("testCalcAverageOfPeople_OrdinaryPeople method Test successful!\nTested method result = %f, expected result = %f", calcAverageOfPeople(data, ORDINARY_PEOPLE), expectedResults);
        else System.out.println("Error");
    }

    public static void testCalcAverageOfPeople_OnlyFatPeople() {//Group of fat people only. Method sort out fat people
        float[] data = {131, 145, 104, 122, 111};
        float expectedResults = (float) 122.6;

        if (calcAverageOfPeople(data, FAT_PEOPLE) == expectedResults)
            System.out.printf("testCalcAverageOfPeople_OnlyFatPeople method Test successful!\nTested method result = %f, expected result = %f", calcAverageOfPeople(data, FAT_PEOPLE), expectedResults);
        else System.out.println("Error");

    }
}