package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
        for (int i=0; i<5; i++){
            arr.add(reader.readLine());
        }
        int max =0;
     //   int n=0;
        for (int i=0; i<arr.size(); i++){
            if(max<arr.get(i).length()) {
                max = arr.get(i).length();
     //           n=i;
            }
            }
      //  System.out.println(arr.get(max));
            for (int i=0; i<arr.size(); i++){
                if(max==arr.get(i).length()) System.out.println(arr.get(i));
        }
    }
}
