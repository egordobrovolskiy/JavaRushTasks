package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tex1 = reader.readLine();
        String tex2 = reader.readLine();
        FileInputStream file1 = new FileInputStream(tex1);
        byte[] buff  = new byte[file1.available()];
        while (file1.available() > 0) {
            file1.read(buff);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(tex1);
        FileInputStream file2 = new FileInputStream(tex2);
        while (file2.available() > 0) {
            fileOutputStream.write(file2.read());
        }
        fileOutputStream.write(buff);
        reader.close();
        file1.close();
        file2.close();
        fileOutputStream.close();

    }
}
