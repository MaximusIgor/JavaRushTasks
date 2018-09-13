package com.javarush.task.task08.task0803;

import java.util.Date;

public class DateCalculation {
    public static void main(String[] args) throws InterruptedException {
        Date currenTime = new Date(); //получаем текущую дату и время
        Thread.sleep(3000); //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date(); //получаем новое текущее время

        long msDelay = newTime.getTime() - currenTime.getTime(); //вычисляем разницу

        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}