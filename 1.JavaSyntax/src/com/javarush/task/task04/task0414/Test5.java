package com.javarush.task.task04.task0414;

/*использование тернарного оператора*/

/**
 * Первый операнд в тернарном операторе должен быть логическим или же представлять собой логическое выражение с результатом.
 * Если первый операнд true, то тернарный оператор возвращает второй операнд,
 * иначе (если первый операнд false) — возвращает третий операнд.
 */
public class Test5 {
    public static void main(String args[]){
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  b );

        b = (a == 10) ? 20 : 30;
        System.out.println( "Значение b: " + b );
    }
}
