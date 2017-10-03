package com.javarush.task.task22.task2213;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }
    //объект будет отрисовывать на экран свое текущее состояние
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int k = 0; k < width; k++) {
                if (matrix[i][k] == 0) {
                    System.out.print(".");
                } else System.out.print("X");
            }
            System.out.println();
        }
    }
    //будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз
    public void removeFullLines() {

    }
    //возвращает значение которое находится в матрице с координатами x и y
    public Integer getValue(int x, int y) {
        return null;
    }
    //устанавливает переданное значение в ячейку массива (матрицы) с координатами x, y
    public void setValue(int x, int y, int value) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
