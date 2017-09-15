package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        String x = "";

        while (inputStream.available() > 0){
            char s = (char) inputStream.read();
            if (s!='\n' && s!='\r') {
                x+=s;
            } else {
                try {
                    int y = Integer.parseInt(x);
                    if (y % 2 == 0) list.add(y);
                } catch (Exception e){
                    e.printStackTrace();
                }
                x = "";
            }
        }
        Collections.sort(list);
        inputStream.close();
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        }
    }

