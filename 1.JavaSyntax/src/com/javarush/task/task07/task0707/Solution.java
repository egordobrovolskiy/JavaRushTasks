package com.javarush.task.task07.task0707;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

/* 
Что за список такой?
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список. Строки придумай сам.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> er = new ArrayList<String>();
        for (int i=0; i<5; i++){
            er.add(i+"a");
        }
        System.out.println(er.size());
        for(int i=0; i<er.size(); i++){
            System.out.println(er.get(i));
        }

    }
}
