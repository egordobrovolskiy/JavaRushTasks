package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) throw new TooShortStringException();
        String[] tex = string.split(" ");
        if (tex.length < 5) throw new TooShortStringException();


        return tex[1]+ " " + tex[2] + " " + tex[3] + " " + tex[4];
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
