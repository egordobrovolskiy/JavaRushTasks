package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.


*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        long all = 0;
        long space = 0;
        double res;
        while (inputStream.available() > 0){
            if (inputStream.read() == 32){
                space++;
            }
            all++;

        }
        inputStream.close();
        res = (double) space/all *100.00;
        System.out.printf(String.format("%.2f", res));

    }
}
