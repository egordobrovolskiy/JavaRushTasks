package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] myChar = reader.readLine().toCharArray();
        String  glasn= "";
        String soglasn = "";
        for (int i=0; i<myChar.length;i++){
            if (isVowel(myChar[i])){
                glasn += myChar[i] + " ";
            } else if (myChar[i]!=32) soglasn += myChar[i]+" ";
        }
        System.out.println(glasn);
        System.out.println(soglasn);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}