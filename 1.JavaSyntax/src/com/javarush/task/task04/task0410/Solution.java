package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следу
«Число а не содержится в интервале.» или «Число а содержится в интервале.«, где а — аргумент метода.
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        //::CODE:
        if(a>=50 && a<=100){
            System.out.println("Число "+ a + " содержится в интервале.");
        }
        else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}