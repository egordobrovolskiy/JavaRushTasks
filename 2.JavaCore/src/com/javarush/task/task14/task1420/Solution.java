package com.javarush.task.task14.task1420;

/* 
НОД
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;

            a = Integer.parseInt(reader.readLine());
            if (a<=0) throw  new Exception();
            b = Integer.parseInt(reader.readLine());
            if (b<=0) throw  new Exception();

            if (a>b) {
                while (b!=0){
                    int x = a%b;
                    a = b;
                    b = x;
                }
                System.out.println(a);
            } else if (b>a) {
                while (a!=0){
                    int y = b%a;
                    b = a;
                    a = y;
                }
                System.out.println(b);
            } else System.out.println(a);

        }
    }

