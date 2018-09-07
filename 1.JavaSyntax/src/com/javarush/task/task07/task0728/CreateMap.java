package com.javarush.task.task07.task0728;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<String, Employee>();

        //HashMap реализует интерфейс Map
        Employee harry = new Employee("Harry Hacker");
        staff.put("987-98-9996", harry);

        String s = "987-98-9996";
        Employee e = staff.get(s);
        System.out.println(s);
    }
}