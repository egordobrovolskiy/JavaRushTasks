package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tex1 = reader.readLine();
        String tex2 = reader.readLine();
        String tex3 = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(tex1);
        FileInputStream file2 = new FileInputStream(tex2);
        FileInputStream file3 = new FileInputStream(tex3);

        while (file2.available() > 0) {
            file1.write(file2.read());
        }
        while (file3.available() > 0) {
            file1.write(file3.read());
        }
        file1.close();
        file2.close();
        file3.close();

    }
}
