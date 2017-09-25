package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        return new StringBuilder().append(Fish).append(Steak).append(Soup).append(Juice).append(Water).toString();
    }
}
