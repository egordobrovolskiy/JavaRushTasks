package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (inputStream.available() > 0) {
            list.add(inputStream.read());
        }
        reader.close();
        inputStream.close();
  //      System.out.println(list);
         int max = 0;
         for (int i =0; i < list.size()-1; i++){
             int control = 0;
             for (int j = i+1; j< list.size(); j++) {
                 if (list.get(i) == list.get(j)) {
                     control++;
                 }
             }
             if (control > max) {
                 max = control;
             }
         }
        for (int i =0; i < list.size()-1; i++){
            int control = 0;
            for (int j = i+1; j< list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    control++;
                }
            }
            if (control == max) {
                max = control;
                list2.add(list.get(i));
            }
        }
        for (int x : list2) {
            System.out.print(x + " ");
        }

    }
}
