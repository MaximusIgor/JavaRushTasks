package com.javarush.task.task01.task0133;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "firefox";
        System.out.println(s1.toUpperCase()); // выведет «FIREFOX»
        String s2 = s1.replace('o', 'a');
        System.out.println(s2); // выведет «firefax»
        System.out.println(s2.charAt(1)); // выведет «i»
        int i;
        i = s1.length();
        System.out.println(i); // выведет 7
        i = s1.indexOf('f');
        System.out.println(i); // выведет 0
        i = s1.indexOf('r');
        System.out.println(i); // выведет 2
        i = s1.lastIndexOf('f');
        System.out.println(i); // выведет 4
        i = s1.indexOf('t');
        System.out.println(i); // выведет -1
        i = s1.indexOf('r',3);
        System.out.println(i); // выведет -1
    }
}
