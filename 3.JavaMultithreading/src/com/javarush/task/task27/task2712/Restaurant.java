package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.util.Observable;

public class Restaurant {
    public static void main(String[] args) {
//        new Tablet(5).createOrder();
        Cook cook = new Cook("Yehor");
        Tablet tablet = new Tablet(5);
        Waiter waiter = new Waiter();
        tablet.addObserver(cook);
        cook.addObserver(waiter);
        tablet.createOrder();
    }
}
