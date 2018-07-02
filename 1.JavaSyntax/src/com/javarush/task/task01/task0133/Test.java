package com.javarush.task.task01.task0133;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i; //обьявляем челочисленную переменную типа int
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) {// возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");// если введено не целое число либо символ
        }
    }
}
