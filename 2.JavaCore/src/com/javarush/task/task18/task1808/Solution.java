package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOut = reader.readLine();
        String fileIn1 = reader.readLine();
        String fileIn2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileOut);
        FileOutputStream file1 = new FileOutputStream(fileIn1);
        FileOutputStream file2 = new FileOutputStream(fileIn2);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available() > 0){
           list.add(inputStream.read());
        }
        for (int i = 0; i < (list.size()/2 + list.size()%2); i++){
            file1.write(list.get(i));
        }
        for (int i = (list.size()/2 + list.size()%2) ; i < list.size(); i++) {
            file2.write(list.get(i));
        }
        reader.close();
        file1.close();
        file2.close();
        inputStream.close();

    }
}
