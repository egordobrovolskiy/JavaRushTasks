package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] cis = new int[10];
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<cis.length; i++){
            cis[cis.length-1-i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<cis.length; i++){
            System.out.println(cis[i]);
        }

    }
}

