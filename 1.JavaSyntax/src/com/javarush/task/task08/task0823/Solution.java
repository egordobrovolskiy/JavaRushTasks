package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String y = "";

       char[] chars = s.toCharArray();

       chars[0] = Character.toUpperCase(chars[0]);
       for (int i=0; i<chars.length;i++){
           if (chars[i] == 32){
               chars[i+1] = Character.toUpperCase(chars[i+1]);
           }
           y+=chars[i];
       }
          System.out.println(y);

        //напишите тут ваш код

    }
}
