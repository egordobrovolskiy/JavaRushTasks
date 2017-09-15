package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".
*/

public class Cat {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void  finalize() throws Throwable{
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable{
        System.out.println("Dog was destroyed");
    }
}
