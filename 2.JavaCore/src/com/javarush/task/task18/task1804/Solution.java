package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
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
        HashMap<Byte, Integer> map = new HashMap<>();
        try {
            while (inputStream.available() > 0) {
                byte d = (byte) inputStream.read();
                if (map.containsKey(d)){
                    map.put(d, map.get(d)+1);
                } else map.put(d, 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
                int min = (Collections.min(map.values()));
                for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                    if (pair.getValue().equals(min)) {
                        System.out.print(pair.getKey() + " ");
                    }
                }
            }catch (Exception e) {

            }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
