package com.javarush.task.task05.task0522;

public class Outer {
    void outerMethod(){
        System.out.println("Метод внешнего класса");
        //Внутренний класс является локальным для метода outerMethod()

        class Inner{
            public void innerMethod(){
                System.out.print("Метод внутреннего класса");
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