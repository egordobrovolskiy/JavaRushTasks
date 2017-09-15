package com.javarush.task.task18.task1816;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/



import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Character> list = new ArrayList<>();
        list.add('q');
        list.add('a');
        list.add('z');
        list.add('w');
        list.add('s');
        list.add('x');
        list.add('e');
        list.add('d');
        list.add('c');
        list.add('r');
        list.add('f');
        list.add('v');
        list.add('t');
        list.add('g');
        list.add('b');
        list.add('y');
        list.add('h');
        list.add('n');
        list.add('u');
        list.add('j');
        list.add('m');
        list.add('i');
        list.add('k');
        list.add('o');
        list.add('l');
        list.add('p');
        list.add('Q');
        list.add('A');
        list.add('Z');
        list.add('W');
        list.add('S');
        list.add('X');
        list.add('E');
        list.add('D');
        list.add('C');
        list.add('R');
        list.add('F');
        list.add('V');
        list.add('T');
        list.add('G');
        list.add('B');
        list.add('Y');
        list.add('H');
        list.add('N');
        list.add('U');
        list.add('J');
        list.add('M');
        list.add('I');
        list.add('K');
        list.add('O');
        list.add('L');
        list.add('P');
        int count = 0;
        while (inputStream.available() > 0) {
            if (list.contains((char) inputStream.read())) count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
