package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x1 = reader.readLine();
        String x2 = reader.readLine();
        FileInputStream file1 = new FileInputStream(x1);
        FileOutputStream file2 = new FileOutputStream(x2);
        ArrayList<Double> doubles = new  ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        String number = "";
        while (file1.available() > 0) {
         //   String number = "";
            char text = (char) file1.read();
            if (!(text == ' ')) {
                number += text;
            } else {
                double d = Double.parseDouble(number);
                doubles.add(d);
                number = "";
            }

        }
        try {
            double d = Double.parseDouble(number);
            doubles.add(d);
        } catch (Exception e) {

        }
            for (int i = 0; i < doubles.size(); i++) {
                list.add((int) Math.round(doubles.get(i)));
            }
            for (int i =0; i < list.size(); i++) {
            file2.write((list.get(i)+" ").getBytes());
            }
            file1.close();
        file2.close();
    }
}
