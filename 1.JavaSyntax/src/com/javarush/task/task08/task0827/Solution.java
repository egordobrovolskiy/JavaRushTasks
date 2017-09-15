package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date end = new Date(date);
        Date nac = new Date();

        nac.setDate(1);
        nac.setMonth(0);
        nac.setYear(end.getYear());
      //  System.out.println(end.getTime());
      //  System.out.println(nac.getTime());
        long msT = end.getTime() - nac.getTime();
        long msD = 60*60*24*1000;
        int x = (int) (msT/msD);
    //    System.out.println(x);
        if (x%2 !=0){return true;}
        else return false;




    }
}
