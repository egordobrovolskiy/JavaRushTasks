package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int b = 0;
        int a = 0;

        if (x<0) b++;
        else if (x>0) a++;
        if (y<0) b++;
        else if (y>0) a++;
        if (z<0) b++;
        else if (z>0) a++;

        System.out.println("количество отрицательных чисел: "+b);
        System.out.println("количество положительных чисел: "+a);

    }
}
