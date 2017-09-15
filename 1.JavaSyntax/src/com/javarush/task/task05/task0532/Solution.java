package com.javarush.task.task05.task0532;

import java.io.*;


/* 
Задача по алгоритмам
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        int N = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (int i =0; i<N ; i++){
            int x = Integer.parseInt(reader.readLine());
            if(maximum<x) maximum=x;
        }

        System.out.println(maximum);
    }
}
