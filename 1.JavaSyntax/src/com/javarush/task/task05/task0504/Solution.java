package com.javarush.task.task05.task0504;


/* 
Трикотаж
1. Программа не должна считывать данные с клавиатуры.
2. Нужно создать три объекта типа Cat.
3. Класс Cat нельзя изменять.
4. Программа не должена выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska1", 2, 23, 43);
        Cat cat2 = new Cat("Vaska2", 3, 22, 47);
        Cat cat3 = new Cat("Vaska3", 4, 21, 41);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}