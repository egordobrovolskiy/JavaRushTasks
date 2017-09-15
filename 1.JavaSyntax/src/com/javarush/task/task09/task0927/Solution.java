package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/* 
Десять котов
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен объявлять и инициализировать переменную типа HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
      HashMap<String, Cat>  catsMap = new HashMap<>();
        //напишите тут ваш код
        catsMap.put("Cat1", new Cat("Cat1"));
        catsMap.put("Cat2", new Cat("Cat2"));
        catsMap.put("Cat3", new Cat("Cat3"));
        catsMap.put("Cat4", new Cat("Cat4"));
        catsMap.put("Cat5", new Cat("Cat5"));
        catsMap.put("Cat6", new Cat("Cat6"));
        catsMap.put("Cat7", new Cat("Cat7"));
        catsMap.put("Cat8", new Cat("Cat8"));
        catsMap.put("Cat9", new Cat("Cat9"));
        catsMap.put("Cat10", new Cat("Cat10"));

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catSet = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            catSet.add(pair.getValue());
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
