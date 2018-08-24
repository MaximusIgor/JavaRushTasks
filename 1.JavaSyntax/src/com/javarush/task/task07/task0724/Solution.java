package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandFather = new Human("Степа", true, 81);
        Human grandFather1 = new Human("Петя", true, 79);
        Human grandMother = new Human("Марта", false, 85);
        Human grandMother1 = new Human("Любовь", false, 83);
        Human mother = new Human("Наташа", false, 41, grandFather, grandMother);
        Human father = new Human("Николай", true, 46, grandFather1, grandMother1);
        Human child = new Human("Алина", false, 20, father, mother);
        Human child1 = new Human("Игорь", true, 27, father, mother);
        Human child2 = new Human("Артем", true, 27, father, mother);

        System.out.println(grandFather.toString());
        System.out.println(grandMother.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}