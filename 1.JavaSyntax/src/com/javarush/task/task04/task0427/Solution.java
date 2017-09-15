package com.javarush.task.task04.task0427;

/* 
Описываем числа
3. Если число четное и имеет одну цифру, вывести "четное однозначное число".
4. Если число нечетное и имеет одну цифру, вывести "нечетное однозначное число".
5. Если число четное и имеет две цифры, вывести "четное двузначное число".
6. Если число нечетное и имеет две цифры, вывести "нечетное двузначное число".
7. Если число четное и имеет три цифры, вывести "четное трехзначное число".
8. Если число нечетное и имеет три цифры, вывести "нечетное трехзначное число".
9. Если введенное число не попадает в диапазон 1 - 999, ничего не выводить на экран
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String x=""+a;

        if (a%2==0 && a>0){
            if (x.length()==1) System.out.println("четное однозначное число");
            else if (x.length()==2) System.out.println("четное двузначное число");
            else if (x.length()==3) System.out.println("четное трехзначное число");
        } else if (a%2!=0 && a>0){
            if (x.length()==1) System.out.println("нечетное однозначное число");
            else if (x.length()==2) System.out.println("нечетное двузначное число");
            else if (x.length()==3) System.out.println("нечетное трехзначное число");
        }

    }
}
