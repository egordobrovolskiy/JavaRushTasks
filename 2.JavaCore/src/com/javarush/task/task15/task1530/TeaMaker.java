package com.javarush.task.task15.task1530;

/*
«Заливаем кипятком»
«Берем чашку для латте»
«Насыпаем чай»
«Берем чашку для чая»
«Заливаем молоком с пенкой»
«Делаем кофе«
*/

public class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }
}
