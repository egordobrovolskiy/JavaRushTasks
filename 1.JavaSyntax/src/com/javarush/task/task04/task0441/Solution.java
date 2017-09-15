package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a<b && a>c) || (a>b && a<c)) System.out.println(a);
        else if ((b<c && b>a) || (b>c && b<a)) System.out.println(b);
        else if ((c<a && c>b) || (c>a && c<b)) System.out.println(c);
        else if (a==b && a==c) System.out.println(a);
        else if (a==b) System.out.println(a);
        else if (a==c) System.out.println(c);
        else if (b==c) System.out.println(b);


    }
}
