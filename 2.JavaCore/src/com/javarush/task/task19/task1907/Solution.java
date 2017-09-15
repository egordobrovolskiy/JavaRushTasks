package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileReader reader1 = new FileReader(name);
        String text = "";
        int count = 0;
        while (reader1.ready()) {
            char x =(char) reader1.read();
            text += x;
        }
        reader1.close();
        String[] textMass = text.split("[\\p{P}\\s]");
        for (String x : textMass) {
            if (x.equals("world")) count++;
        }
        System.out.println(count);
    }
}
