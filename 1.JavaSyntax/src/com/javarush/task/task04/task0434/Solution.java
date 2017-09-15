package com.javarush.task.task04.task0434;


/* 
Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 1;
        int y = 1;
        while (x<=10) {
            while (y <= 10) {
                System.out.print(x * y);
                System.out.print(" ");
                y++;
            }

            System.out.println("");
            y=1;
            x++;
        }


    }
}
