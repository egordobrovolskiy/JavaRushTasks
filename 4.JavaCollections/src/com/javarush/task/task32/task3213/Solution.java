package com.javarush.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Шифр Цезаря
Привет Амиго. Ты знаешь, за нами следят, просматривают нашу переписку. Поэтому нужно шифровать трафик.
Для тебя не составит труда реализовать шифр Цезаря, напомню что это просто сдвиг вправо по алфавиту на key букв.
В методе main есть хороший пример.

Реализуй логику метода String decode(StringReader reader, int key).
Метод получает данные в закодированном виде.
Он должен вернуть дешифрованную строку, что хранится в StringReader — е.
Возвращаемый объект ни при каких условиях не должен быть null.
Метод main не участвует в тестировании.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo

    }

    public static String decode(StringReader reader, int key) throws IOException {

        //не пропустил, хотя работает.
       /* StringWriter writer = new StringWriter();
        int text;
        try {
            while ((text = reader.read()) != -1) {
                writer.append((char) (text + key));
            }
        } catch (IOException e) {
            return new String();
        }
        return writer.toString();
    }*/

        int a;
        StringBuffer res = new StringBuffer();

        try {
            while ((a = reader.read()) != -1) {
                res.append(Character.toString((char) (a + key)));
            }
        } catch (Exception e) {
            return new String();
        }

        return res.toString();
    }

}
