package com.javarush.task.task04.task0413;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader.readLine());

        if(d==1){
            System.out.println("понедельник");
        }
        else if(d==2){
            System.out.println("вторник");
        }
        else if(d==3){
            System.out.println("среда");
        }
        else  if (d==4){
            System.out.println("четверг");
        }
        else if (d==5){
            System.out.println("пятница");
        }
        else if (d==6){
            System.out.println("суббота");
        }
        else if (d==7){
            System.out.println("воскресенье");
        }
        else {
            System.out.println("такого дня недели не существует");
        }
    }
}