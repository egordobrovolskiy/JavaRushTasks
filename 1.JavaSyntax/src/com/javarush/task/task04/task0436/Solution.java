package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int n2=n;


        for (int i = 1; i<=m; m--){
            for (int y=1; y<=n2; n2--){
                System.out.print("8");
            }
            System.out.println("");
            n2=n;
        }

    }
}
