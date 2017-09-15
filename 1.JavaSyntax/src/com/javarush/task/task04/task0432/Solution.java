package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        while (n>0){
            System.out.println(a);
            n--;
        }

    }
}
