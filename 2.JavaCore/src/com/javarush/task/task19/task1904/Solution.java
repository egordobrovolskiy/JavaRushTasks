package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner.
Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
 Метод read() должен читать данные только одного человека.
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        PersonScannerAdapter (Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String text = fileScanner.nextLine();
            String[] mass = text.split(" ");
                int years = Integer.parseInt(mass[mass.length-1]);
                int month = Integer.parseInt(mass[mass.length-2]);
                int day = Integer.parseInt(mass[mass.length-3]);

            // Person(String firstName, String middleName, String lastName, Date birthDate)
            //Петров Петр Петрович 31 12 1957
            return new Person(mass[1], mass[2], mass[0], new Date(years-1900, month-1, day));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
