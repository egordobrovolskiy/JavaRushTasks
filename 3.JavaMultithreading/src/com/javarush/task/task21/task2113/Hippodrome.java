package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public Hippodrome(List<Horse> list) {
        this.horses =list;
    }
    public List<Horse> getHorses() {
        return this.horses;
    }

    static Hippodrome game;


    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Strelka", 3,0));
        list.add(new Horse("Belka", 3, 0));
        list.add(new Horse("Celka", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }
    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }
    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }
    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }
    public Horse getWinner() {
        double dist = horses.get(0).distance;
        Horse x = horses.get(0);
        for (int i =1; i<horses.size(); i++) {
            if (x.distance < horses.get(i).distance) x= horses.get(i);
        }
        return x;
    }
    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
