package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 41;
    }

    @Override
    public String getDescription() {
        //<getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.>
        String Sssss = Country.BELARUS;
        int N = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
