package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
String состоящих из 10 записей по принципу «Фамилия» - «Имя».

5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Сидоров", "Леха");
        map.put("Иванов", "Петя");
        map.put("Петров", "Егор");
        map.put("Козлов", "Вася");
        map.put("Петухов", "Леха");
        map.put("Иванов2", "Женя");
        map.put("Прожекторов", "Игрнат");
        map.put("Котов", "Настя");
        map.put("Коров", "Вася");
        map.put("Мясоедов", "Мурат");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
      int  firstName=0;
      for (Map.Entry<String, String> pair: map.entrySet()){

              if (name.equals(pair.getValue())) firstName++;
          }
          return firstName;
      }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int lastN = 1;
        for (Map.Entry<String, String> pair: map.entrySet()){
            if (lastName.equals(pair.getKey())) lastN++;
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
