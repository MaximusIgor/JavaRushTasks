package com.javarush.task.task08.task0803;

import java.util.Date;

public class PassedTime {
    public static void main(String[] args) throws InterruptedException {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int sec = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + sec);
    }
}