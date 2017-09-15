package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet,
создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.

16. Метод readKeyFromConsoleAndInitPlanet должен быть вызван в статическом блоке класса Solution.
17. Метод readKeyFromConsoleAndInitPlanet должен считывать одну строку с клавиатуры.
18. Метод readKeyFromConsoleAndInitPlanet должен корректно обновлять значение переменной thePlanet в соответствии с условием задачи.
19. Классы Sun, Moon и Earth должны быть созданы в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = null;
        try {
            x = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (x.equals(Planet.SUN)) thePlanet = new Sun();
         else if (x.equals(Planet.EARTH)) thePlanet = new Earth();
         else if (x.equals(Planet.MOON)) thePlanet = new Moon();
         else thePlanet = null;
    }
}
