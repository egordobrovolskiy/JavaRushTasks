package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String b = ""+number;
        String[] a = b.split("");
        int m = 0;
        for(int i = 0; i<a.length; i++){
            m+=Integer.parseInt(a[i]);
        }
        return m;
    }
}