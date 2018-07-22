package com.javarush.task.task05.task0521;

public class Outer {
    void outerMethod() {
        int x = 98;
        System.out.println("Метод внешнего класса");
        class Inner {
            public void innerMethod() {
                System.out.println("x = " + x);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}