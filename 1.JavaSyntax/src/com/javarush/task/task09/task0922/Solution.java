package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Все переменные должны быть проинициализированы.
5. Программа должна выводить данные на экран.
6. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, y", Locale.ENGLISH);
        try {
            Date date = new Date(reader.readLine());
            System.out.println(simpleDateFormat.format(date).toUpperCase());
        }catch (Exception e){
            System.out.println("Nevernii format");
        }


    }
}
