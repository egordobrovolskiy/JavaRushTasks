package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        int x =list.get(0);
        int y = 1;
        int y1 = 1;
        for (int i = 1; i<list.size();i++){
            if (list.get(i)==x) {
                y++;
                if (y1<y) y1=y;
            }
            else {
                x=list.get(i);
                y=1;
            }
        }
        System.out.println(y1);

    }
}