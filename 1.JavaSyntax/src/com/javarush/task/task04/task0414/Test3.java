package com.javarush.task.task04.task0414;
/*применение логических операторов*/
public class Test3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a&&b));

        System.out.println("a || b = " + (a||b) );

        System.out.println("!(a && b) = " + !(a && b));
    }
}
/**
 * &&	Называется логический оператор «И». Если оба операнда являются не равны нулю,
 * то условие становится истинным (A && B) — значение false.
 *
 * ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю,
 * то условие становится истинным(A || B) — значение true.
 *
 * !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
 * Если условие имеет значение true, то оператор логического «НЕ» будет делать false !(A && B) — значение true.
 * */