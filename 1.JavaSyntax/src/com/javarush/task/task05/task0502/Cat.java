package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if ((weight + strength + age) > (anotherCat.weight + anotherCat.strength + anotherCat.age)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.age = 3;
        cat1.weight = 5;
        cat1.strength = 50;

        Cat cat2 = new Cat();

        cat2.age = 5;
        cat2.weight = 6;
        cat2.strength = 40;

    }
}
