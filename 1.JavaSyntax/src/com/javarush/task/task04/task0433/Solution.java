package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 10;
        int y = 10;

        while (x>0){
            while (y>0){
                System.out.print("S");
                y--;
            }
            y = 10;
            System.out.println("");
            x--;
        }

    }
}
