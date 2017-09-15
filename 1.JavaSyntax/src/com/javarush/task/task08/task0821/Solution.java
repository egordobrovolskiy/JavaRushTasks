package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Сидоров", "Леха");
        map.put("Иванов", "Петя");
        map.put("Петров", "Егор");
        map.put("Козлов", "Вася");
        map.put("Петухов", "Леха");
        map.put("Иванов", "Женя");
        map.put("Прожекторов", "Игрнат");
        map.put("Котов", "Настя");
        map.put("Коров", "Вася");
        map.put("Мясоедов", "Мурат");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
