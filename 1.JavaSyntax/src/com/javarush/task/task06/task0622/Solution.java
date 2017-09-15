package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        int g = 0;

        for (int i =0; i<list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i =0; i<list.length-1; i++){
            for (int k = i; k<list.length-1; k++){
                if (list[i]>list[k+1]){
                    g = list[i];
                    list[i] = list[k+1];
                    list[k+1] = g;
                }
            }
        }
        for (int x : list){
            System.out.println(x);
        }

        //напишите тут ваш код
    }
}
