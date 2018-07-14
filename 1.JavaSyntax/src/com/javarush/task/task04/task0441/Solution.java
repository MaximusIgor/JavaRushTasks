package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b && b > c) {
            System.out.println(b);
        } else if (a > c && c > b) {
            System.out.println(c);
        } else if (b > a && a > c) {
            System.out.println(a);
        } else if (b > c && c > a) {
            System.out.println(c);
        } else if (c > a && a > b) {
            System.out.println(a);
        } else if (c > b && b > a) {
            System.out.println(b);
        } else if (a == b && a == c && b == c) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println(a);
        } else if (c == b) {
            System.out.println(b);
        } else if (a == c) {
            System.out.println(c);
        }
//        int[] array = new int[3];
//        array[0] = a;
//        array[1] = b;
//        array[2] = c;
//        Arrays.sort(array);
//        System.out.println(array[1]);
    }
}