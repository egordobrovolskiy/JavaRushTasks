package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
     //   System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
     //   System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
     //   System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
     //   System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
     //   System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
