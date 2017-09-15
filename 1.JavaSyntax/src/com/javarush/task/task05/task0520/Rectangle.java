package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/


public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;
    public Rectangle(int left, int top, int width, int height){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }
    public Rectangle(int left, int top){
        this.left=left;
        this.top=top;
        this.width=0;
        this.height=0;
    }
    public Rectangle(int left, int top, int width){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=width;
    }
    public Rectangle(Rectangle copy, int left, int top, int width, int height){
        copy.left=left;
        copy.top=top;
        copy.width=width;
        copy.height=height;
    }

    public static void main(String[] args) {

    }
}
