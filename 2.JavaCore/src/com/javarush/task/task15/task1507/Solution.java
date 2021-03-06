package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
        printMatrix(m, (double) n, (String) value);
    }
    public static void printMatrix (int m, double n, String value){ printMatrix((double) m, (int) n, value); }
    public static void printMatrix (double m, int n, String value) { printMatrix((short) m, n, value);}
    public static void printMatrix (short m, int n, String value){ printMatrix((int) m, (short) n, value);}
    public static void printMatrix (int m, short n, String value) { printMatrix(m, (double) n, (Object)value);}
    public static void printMatrix (int m, double n, Object value){ printMatrix((double) m, (int) n, value);}
    public static void printMatrix (double m, int n, Object value) { printMatrix((short) m, (double) n, value);}
    public static void printMatrix (short m, double n, Object value) { printMatrix((short) m, (short) n, value);}
    public static void printMatrix (short m, short n, Object value) {}
}
