package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());

        if(y>20) System.out.println("И 18-ти достаточно");

    }
}
