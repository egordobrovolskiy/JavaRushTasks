package com.javarush.task.task15.task1530;

/*
«Заливаем кипятком»
«Берем чашку для латте»
«Насыпаем чай»
«Берем чашку для чая»
«Заливаем молоком с пенкой»
«Делаем кофе«
*/

public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}
