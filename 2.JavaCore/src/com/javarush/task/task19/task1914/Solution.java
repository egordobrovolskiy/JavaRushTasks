package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        System.setOut(consoleStream);
        String[] mass = result.split("\\s");
        int x = Integer.parseInt(mass[0]);
        int y = Integer.parseInt(mass[2]);
        int z =0;
        switch (mass[1]){
            case "+":
                z = x+y;
                break;
            case "-":
                z = x-y;
                break;
            case "*":
                z = x*y;
                break;
        }
        //3 + 6 = 9

       System.out.printf("%d %s %d = %d", x,mass[1],y,z);
    //    System.out.print(x + " " + mass[1] + " " + y + " " + mass[3] + " " + z);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

