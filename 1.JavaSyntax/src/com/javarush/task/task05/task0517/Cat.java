package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор,
принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор,
принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор,
принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор,
принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор,
принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name=name;
        this.age=5;
        this.weight=8;
        this.color="gray";
    }
    public Cat(String name, int weight, int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color="gray";
    }
    public Cat(String name, int age){
        this.name=name;
        this.age=age;
        this.weight=8;
        this.color="gray";
    }
    public Cat(int weight, String color){
        this.age=5;
        this.weight=weight;
        this.color=color;
    }
    public Cat(int weight, String color, String address){
        this.age=5;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }

    public static void main(String[] args) {

    }
}
