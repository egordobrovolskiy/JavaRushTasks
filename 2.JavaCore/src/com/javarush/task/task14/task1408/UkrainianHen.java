package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    @Override
    public String getDescription() {
        String Sssss = Country.UKRAINE;
        int N = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Sssss + ". Я несу " + N + " яиц в месяц.";
    }
    @Override
    public String toString() {
        return String.format("%s Моя страна — %s. Я несу %s яиц в месяц.", getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
