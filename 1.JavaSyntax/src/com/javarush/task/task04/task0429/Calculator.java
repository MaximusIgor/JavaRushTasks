package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int b, c, d;
        System.out.println("Input two numbers.");
        b = Integer.parseInt(r.readLine());
        c = Integer.parseInt(r.readLine());
        boolean a = false;
        while (!a) {
            System.out.println("Your numbers are: " + b + " & " + c);
            System.out.println(b + " * " + c + " = ");
            d = Integer.parseInt(r.readLine());
            if (d == (b * c)) {
                System.out.println("Great! You're like Einstein!");
                a = true;
            } else {
                System.out.println("Wrong! Try again.");
                System.out.println("");
            }
        }
    }
}
