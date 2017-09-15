package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<String>();

        for (int i=0; i<10;i++){
            list.add(reader.readLine());
        }
        int max = list.get(0).length();
        int min = list.get(0).length();
        for (int i=0; i<list.size();i++){
            if(max<list.get(i).length()) max=list.get(i).length();
            if(min>list.get(i).length()) min=list.get(i).length();
        }
        for(int i=0; i<list.size(); i++){
            if(max == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            } else if (min==list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
