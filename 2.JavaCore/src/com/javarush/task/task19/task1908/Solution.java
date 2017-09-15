package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader br = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));
        while (br.ready()) {
           String text = br.readLine();
           String[] textMass = text.split("\\s");
           for (String x : textMass) {
               try {
                   int y = Integer.parseInt(x);
                   bw.write((y + " "));
               } catch (Exception e) {
               }
           }
            }
            br.close();
        bw.close();
        }
    }
