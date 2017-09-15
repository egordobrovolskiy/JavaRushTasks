package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[20];
        for (int i=0; i<list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        int maximum=list[0];
        int minimum=list[0];
        for (int i=0; i<list.length; i++){
            if (maximum<list[i]) maximum=list[i];
            if (minimum>list[i]) minimum=list[i];
        }

        //напишите тут ваш код

        System.out.print(maximum);
        System.out.print(" ");
        System.out.println(minimum);
    }
}
