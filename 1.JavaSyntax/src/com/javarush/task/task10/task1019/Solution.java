package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию.
Ключ и значение разделены пробелом. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int id;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e){
                break;
            }

            String name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

       // System.out.println("Id=" + id + " Name=" + name);
    }
}
