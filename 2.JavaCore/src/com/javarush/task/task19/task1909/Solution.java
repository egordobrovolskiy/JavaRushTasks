package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
            char x = (char) br.read();
            if (x == '.') {
                bw.write('!');
            } else bw.write(x);
        }
        br.close();
        bw.close();
    }
}
