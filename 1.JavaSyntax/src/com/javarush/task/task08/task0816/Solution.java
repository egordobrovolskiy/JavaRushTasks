package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stel", new Date("MAY 1 1990"));
        map.put("Ctor", new Date("MAY 1 1990"));
        map.put("Fred", new Date("MAY 1 1990"));
        map.put("Med", new Date("MAY 1 1990"));
        map.put("Pud", new Date("MAY 1 1990"));
        map.put("Xom", new Date("MAY 1 1990"));
        map.put("Kiria", new Date("MAY 1 1990"));
        map.put("Lomn", new Date("MAY 1 1990"));
        map.put("Shvarc", new Date("MAY 1 1990"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        //напишите тут ваш код
        HashMap<String, Date> map2 = new HashMap<>();
        for (Map.Entry<String, Date> pair: map.entrySet()){
            Date d = pair.getValue();
          //  System.out.println(d.getMonth());
            if(d.getMonth() > 7 || d.getMonth() < 5){
                map2.put(pair.getKey(), pair.getValue());
            }

        }
        map.clear();
        map.putAll(map2);
    /*    for (Map.Entry<String, Date> pair: map.entrySet()){
            System.out.println(pair.getKey() + pair.getValue().getMonth());
        }
    */


    }

    public static void main(String[] args) {
   //     removeAllSummerPeople(createMap());

    }
}
