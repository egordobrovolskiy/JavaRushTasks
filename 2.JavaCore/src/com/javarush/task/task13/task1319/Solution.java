package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        while (true){
            String text = reader.readLine();
            writer.write(text + "\n");
            if (text.equals("exit")) break;
        }
        writer.close();
        reader.close();
    }
}
