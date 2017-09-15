package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name
Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String[] a1 = x.split("\\?");
        String[] a2 = a1[1].split("&");
        ArrayList<String> a = new ArrayList<>();
        double doble = 0;
        String dobleString = "";

        for (String q : a2) {
            if (q.contains("obj")) {
                String[] q1 = q.split("=");
                try {
                    doble = Double.parseDouble(q1[1]);
                } catch (Exception e){
                    dobleString = q1[1];
                }
                a.add(q1[0]);
            }else if (q.contains("=")){
                String[] q3 = q.split("=");
                a.add(q3[0]);
                } else a.add(q);
            }
            if (a.contains("obj")){
            if (dobleString.equals("")){
                for (String b : a){
                    System.out.print(b + " ");
                }
                System.out.println();
                alert(doble);
            } else {
                for (String b : a){
                    System.out.print(b + " ");
                }
                System.out.println();
                alert(dobleString);
            }

            } else {
                for (String b : a){
                    System.out.print(b + " ");
                }
            }
        }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
