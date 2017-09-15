package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }


    public static void sort(String[] array) {
        //напишите тут ваш код
        String ppp;
        for (int i = 0; i<array.length; i++){
            if (!isNumber(array[i])){
                for (int x = i; x<array.length; x++){
                    if (!isNumber(array[x])) {
                        if (isGreaterThan(array[i], array[x])){
                            ppp = array[i];
                            array[i] = array[x];
                            array[x] = ppp;
                        }
                    }
                }
            }
        }
        for(int i1=0;i1<array.length;i1++) {
            if (isNumber(array[i1])) {
                for (int i2 = i1; i2 < array.length; i2++) {
                    if (isNumber(array[i2])) {
                        if (Integer.parseInt(array[i1])< Integer.parseInt(array[i2])) {
                            ppp = array[i1];
                            array[i1] = array[i2];
                            array[i2] = ppp;
                        }
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
