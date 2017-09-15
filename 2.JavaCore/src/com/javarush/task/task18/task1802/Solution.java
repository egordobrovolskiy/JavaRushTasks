package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int min = Integer.MAX_VALUE;
        while (inputStream.available() > 0){
            int data = inputStream.read();
            if (data<min) min=data;
        }
        inputStream.close();
        System.out.println(min);
    }
}
