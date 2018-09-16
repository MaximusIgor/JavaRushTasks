package com.javarush.task.task05.task0508;

public class MyData {
    public static String name;
    public int age;



    MyData my = new MyData() {
        {
            name = "foo";
            age = 20;
        }
    };
    public static void main(String[] args) {
        System.out.println(name);
    }
}
