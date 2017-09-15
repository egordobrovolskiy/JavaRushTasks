package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int y = 0;
        int e = 0;
        int s = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>=b && a>=c) {
            y = a;
        } else if (b>=c) {
            y = b;
        } else y = c;


        if (a<=b && a<=c) {
            s = a;
        } else if (b<=c) {
            s = b;
        } else s = c;

        if ((a>=b && a<=c) || (a<=b && a>=c)) {
            e=a;
        } else if ((b>=a && b<=c) ||(b<=a && b>=c)){
            e=b;
        }else {
            e=c;
        }
        System.out.println(y+" "+e+" "+s);
    }
}
