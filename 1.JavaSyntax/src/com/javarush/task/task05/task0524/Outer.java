package com.javarush.task.task05.task0524;

public class Outer {
    // Простой внутренний класс
    class Inner {

        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}