package com.javarush.task.task04.task0439;

public class Test1 {
    public static void main(String[] args) {

            boolean t = true;
            first:
            {
                second:
                {
                    third:
                    {
                        System.out.println("Перед оператором break.");
                        if (t) {
                            break second; // выход из блока second
                        }
                        System.out.println("Данный оператор никогда не выполнится");
                    }
                    System.out.println("Данный оператор никогда не выполнится ");
                }
                System.out.println("Данный оператор размещен после блока second.");
            }
        }
    }