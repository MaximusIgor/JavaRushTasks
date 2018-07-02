package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       // Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name = "Java";
        zerg2.name = "Duke";
        zerg3.name = "C++";
        zerg4.name = "C#";
        zerg5.name = "CSS";
        zerg6.name = "HTML";
        zerg7.name = "JavaScript";
        zerg8.name = "MySQL";
        zerg9.name = "C1";
        zerg10.name = "Python";

        // Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();

        protoss1.name = "Class";
        protoss2.name = "Object";
        protoss3.name = "Method";
        protoss4.name = "Constructor";
        protoss5.name = "Variable";

        // Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();

        terran1.name = "Integer";
        terran2.name = "Double";
        terran3.name = "Float";
        terran4.name = "Byte";
        terran5.name = "Short";
        terran6.name = "Long";
        terran7.name = "Character";
        terran8.name = "Boolean";
        terran9.name = "String";
        terran10.name = "Array";
        terran11.name = "Collection";
        terran12.name = "Interface";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
