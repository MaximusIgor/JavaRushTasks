package com.javarush.task.task07.task0717;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).contains("л") && !(list.get(i).contains("р"))){
                list.add(i,list.get(i));
               i++;
            }
            else if (list.get(i).contains("р") && !list.get(i).contains("л")){
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }
}