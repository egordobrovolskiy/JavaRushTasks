package com.javarush.task.task03.task0318;

/* 
План по захвату мира
«имя» захватит мир через «число» лет. Му-ха-ха!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int years = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
     //   String sYears = reader.readLine();
     //   int years = Integer.parseInt(sYears);


        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");

    }
}
