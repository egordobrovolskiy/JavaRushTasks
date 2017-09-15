package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
1. Добавь в класс Cat public статическую переменную cats (ArrayList).
2. Переменная cats должна быть проинициализирована.
3. Метод main должен создавать 10 объектов Cat.
4. Метод main должен добавить всех созданных котов в переменную cats.
5. Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i =0; i<10; i++){
            Cat.cats.add(new Cat());
        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for(int i =0; i<Integer.valueOf(cats.size());i++){
            System.out.println(cats.get(i));
        }
    }
}
