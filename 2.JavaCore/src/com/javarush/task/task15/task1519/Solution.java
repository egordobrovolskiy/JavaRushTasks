package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово «exit«.
2. Для каждого значения, кроме «exit«, вызвать метод print. Если значение:
2.1. содержит точку ‘.‘, то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше нуля или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x;
        while (true){
            x = reader.readLine();
            if (x.equals("exit")) break;
            else if (x.contains(".")) {
                try {
                print(Double.parseDouble(x));
                } catch (Exception e) {
                    print(x);
                }
            } else {
                try {
                    int y = Integer.parseInt(x);
                    if (Integer.parseInt(x)>0 && Integer.parseInt(x)<128) print((short)Integer.parseInt(x));
                    else if (Integer.parseInt(x)<=0 || Integer.parseInt(x)>=128) print(Integer.parseInt(x));

                } catch (Exception e) {
                    print(x);
                }
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
