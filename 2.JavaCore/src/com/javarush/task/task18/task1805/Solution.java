package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        TreeSet<Byte> set = new TreeSet<>();
        try {
            while (inputStream.available() > 0){
                byte x = (byte) inputStream.read();
                set.add(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Byte z : set) {
            System.out.print(z + " ");
        }
    }
}
