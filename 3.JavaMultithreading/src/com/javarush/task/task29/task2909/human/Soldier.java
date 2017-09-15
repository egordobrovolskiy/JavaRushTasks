package com.javarush.task.task29.task2909.human;

public class Soldier extends Human {
    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
        fight();
    }

    public void fight() {

    }

    public void printData() {
        System.out.println("Солдат: " + name);
    }

    @Override
    public BloodGroup getBloodGroup() {
        return super.getBloodGroup();
    }
}

