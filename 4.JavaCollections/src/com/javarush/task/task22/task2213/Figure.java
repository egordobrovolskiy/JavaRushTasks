package com.javarush.task.task22.task2213;

public class Figure {
    private int x;
    private int y;
    private int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public void left() {
        x = x - 1;
        if (!isCurrentPositionAvailable()) {
            x = x +1;
        }
    }

    public void right() {
        x = x + 1;
        if (!isCurrentPositionAvailable()) {
            x = x - 1;
        }
    }

    public void down() {
        y = y + 1;
        if (!isCurrentPositionAvailable()) {
            y = y - 1;
        }

    }

    public void up() {
        y = y - 1;
        if (!isCurrentPositionAvailable()) {
            y = y + 1;
        }
    }

    public void rotate() {

    }

    public void downMaximum() {

    }

    public boolean isCurrentPositionAvailable() {
        return true;
    }

    public void landed() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
