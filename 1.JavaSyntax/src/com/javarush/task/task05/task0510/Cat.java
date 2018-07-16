package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name, address, color;
    private int age, weight;

    public void initialize(String name){
        this.name  = name;
        this.color = "white";
        this.age = 1;
        this.weight = 3;
    }

    public void initialize(String name, int weight, int age){
        this.name  = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }

    public void initialize(String name, int age){
        this.name  = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;

    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
