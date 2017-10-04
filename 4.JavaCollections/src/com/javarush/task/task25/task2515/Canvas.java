package com.javarush.task.task25.task2515;

public class Canvas {

    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height+2][width+2];
    }

    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
            matrix[i][k] = ' ';
            }
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }



    public void setPoint(double x, double y, char c) {

        if (x < 0 || y < 0 || y > matrix.length || x > matrix[0].length) {
        } else {
            int iX = (int) Math.round(x);
            int iY = (int) Math.round(y);
           matrix[iY][iX] = c;
        }

    }
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] != 0) {
                    setPoint(x + k, y + i, c);
                }
            }
        }


    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
