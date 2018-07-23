package com.javarush.task.task05.task0520;

public class Outer {
    // Анонимный класс наследуется от класса Demo

    static Demo demo = new Demo() {

        public void show() {
            super.show();
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    public static void main(String[] args) {
        demo.show();
    }
}

class Demo {
    public void show() {
        System.out.println("Метод суперкласса");
    }
}