package com.javarush.task.task08.task0802;

public class Walk{
    public static void main(String[] args) {
        int temperature = 20;
        boolean isRaining = true;
        int minutes = 0;

        if (isRaining || temperature <= 10 || temperature > 35) {
            minutes = 0;
            System.out.println("Время прогулки" + minutes + "минут.");
        } else if (!isRaining && temperature < 15) {
            minutes = 30;
            System.out.println("Время прогулки" + minutes + "минут.");
        } else if (!isRaining && (temperature >= 15 && temperature <25)) {
            minutes = 40;
            System.out.println("Время прогулки" + minutes + "минут.");
        } else if (!isRaining && temperature >= 25) {
            minutes = 20;
            System.out.println("Время прогулки" + minutes + "минут.");
        }
    }
}