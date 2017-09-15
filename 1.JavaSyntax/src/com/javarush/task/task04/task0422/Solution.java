package com.javarush.task.task04.task0422;

/* 
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());

        if (y<18) System.out.println("Подрасти еще");
    }
}
