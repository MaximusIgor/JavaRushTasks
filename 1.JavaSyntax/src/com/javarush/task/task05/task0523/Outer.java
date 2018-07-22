package com.javarush.task.task05.task0523;

public class Outer {
    // Статический внутренний класс
    static class Inner {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
    }


}