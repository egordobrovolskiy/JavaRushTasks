package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
1. Метод readString должен считывать и возвращать строку(тип String).
2. Метод readInt должен считывать и возвращать число(тип int).
3. Метод readDouble должен считывать и возвращать дробное число(тип double).
4. Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stroka = reader.readLine();
        return stroka;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cislo = Integer.parseInt(reader.readLine());
        return cislo;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double drob = Double.parseDouble(reader.readLine());
        return drob;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean log = Boolean.parseBoolean(reader.readLine());
        return log;

    }

    public static void main(String[] args) {

    }
}
