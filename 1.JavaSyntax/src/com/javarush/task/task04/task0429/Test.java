package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;

        while(!isExit){
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }
        System.out.println("The end of loop while.");
    }
}
