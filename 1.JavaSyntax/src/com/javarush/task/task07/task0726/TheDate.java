package com.javarush.task.task07.task0726;

import java.util.Scanner;

public class TheDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, m = 1, g = 2;
        int[] today;
        int[] tomorrow;
        int[] yesterday;

        do {//Запрашивать дату от пользователя до тех пор пока дата не будет введена верно
            today = getDateFromUser();
        }
        while (!isCorrectInput(today[n], today[m], today[g]));{

            tomorrow = calcDayTomorrow(today[n], today[m], today[g]);
            System.out.printf("Tomorrow will be: %d (n)day, %d (m)month, %d (g)year\n", tomorrow[0], tomorrow[1], tomorrow[2]);

            yesterday = calcDayYesterday(today[n], today[m], today[g]);
            System.out.printf("***************************************************" +
                    "\nYesterday was: %d (n)day, %d (m)month, %d (g)year\n", yesterday[0], yesterday[1], yesterday[2]);
        }
    }

    static boolean isCorrectInput(int day, int month, int year) {//Метод для вычисления правильности ввода дней и месяцев
        if (day > daysInMonth(year, month) || day < 1 || month > 12 || month < 1) {
            System.out.println("Sorry, entry is not correct. Please check DAY MONTH YEAR format and try again.");
            return false;
        } else return true;
    }

    static int[] getDateFromUser() {//Метод для получения даты от пользователя
        int[] today = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type DAY MONTH YEAR:");
        for (int i = 0; i < today.length; i++) {
            today[i] = sc.nextInt();
       }
        return today;
    }

    static int daysInMonth(int year, int month) {//Метод для вычисления дней в месяце
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (isLeapYear(year)) days = 29;
                else days = 28;
                break;
        }
        return days;
    }

    static boolean isLeapYear(int year) {//Метод для проверки високосного года
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;
    }

    static int[] calcDayTomorrow(int day, int month, int year) {//Метод для расчёта завтрашнего дня
        int[] tomorrow = new int[3];

        if (day % daysInMonth(year, month) != 0 && month % 12 != 0) {//Не конец месяца и не конец года
            tomorrow[0] = day + 1;
            tomorrow[1] = month;
            tomorrow[2] = year;
        } else if (day % daysInMonth(year, month) == 0 && month % 12 != 0) {//Конец месяца но не конец года
            tomorrow[0] = 1;
            tomorrow[1] = month + 1;
            tomorrow[2] = year;
        } else if (day % daysInMonth(year, month) == 0 && month % 12 == 0) {//Конец месяца и конец года
            tomorrow[0] = 1;
            tomorrow[1] = 1;
            tomorrow[2] = year + 1;
        } else if (day % daysInMonth(year, month) != 0 && month % 12 == 0) {//Не конец месяца но конец года
            tomorrow[0] = day + 1;
            tomorrow[1] = month;
            tomorrow[2] = year;
        }
        return tomorrow;
    }

    static int[] calcDayYesterday(int day, int month, int year) {//Метод для расчёта вчерашнего дня
        int[] yesterday = new int[3];

        if (day > 1 && month > 1) {//Не начало месяца и не начало года
            yesterday[0] = day - 1;
            yesterday[1] = month;
            yesterday[2] = year;
        } else if (day == 1 && month > 1) {//Начало месяца но не начало года
            yesterday[0] = daysInMonth(year, month - 1);
            yesterday[1] = month - 1;
            yesterday[2] = year;
        } else if (day == 1 && month == 1) {//Начало месяца и начало года
            yesterday[0] = daysInMonth(year - 1, month = 12);
            yesterday[1] = 12;
            yesterday[2] = year - 1;
        } else if (day > 1 && month == 1) {//Не начало месяца но начало года
            yesterday[0] = day - 1;
            yesterday[1] = month;
            yesterday[2] = year;
        }
        return yesterday;
    }
}