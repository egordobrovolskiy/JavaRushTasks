package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
1. Добавь в класс Cat конструктор без параметров public Cat().
2. Конструктор класса должен на 1 увеличивать значение переменной catCount.
3. Добавь в класс Cat метод finalize.
4. Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
5. Метод finalize должен уменьшать переменную catCount на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat(){catCount++;}

    protected void finalize() throws Throwable{catCount--;}

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}