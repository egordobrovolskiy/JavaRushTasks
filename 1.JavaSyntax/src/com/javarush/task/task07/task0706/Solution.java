package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение
"В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.

4. Программа должна вывести сообщение
"В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] mas = new int[15];
        int cetn =0;
        int neCetn = 0;

        for (int i =0;i<mas.length;i++){
            mas[i]=Integer.parseInt(reader.readLine());
            if(i%2==0) cetn = cetn + mas[i];
            else neCetn=neCetn+mas[i];
        }

        if(cetn>neCetn) System.out.println("В домах с четными номерами проживает больше жителей.");
        else if(cetn<neCetn) System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
