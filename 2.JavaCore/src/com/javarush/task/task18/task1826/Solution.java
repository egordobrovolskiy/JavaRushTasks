package com.javarush.task.task18.task1826;

/* 
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName — имя файла, который необходимо зашифровать/расшифровать.
fileOutputName — имя файла, куда необходимо записать результат шифрования/дешифрования.
-e — ключ указывает, что необходимо зашифровать данные.
-d — ключ указывает, что необходимо расшифровать данные.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        switch (args[0]) {
            case "-e":
                fileInputStream = new FileInputStream(args[1]);
                fileOutputStream = new FileOutputStream(args[2]);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 1);
                }
                fileInputStream.close();
                fileOutputStream.close();
                break;
            case "-d":
                fileInputStream = new FileInputStream(args[1]);
                fileOutputStream = new FileOutputStream(args[2]);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 1);
                }

                    fileInputStream.close();
                fileOutputStream.close();
                break;
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
