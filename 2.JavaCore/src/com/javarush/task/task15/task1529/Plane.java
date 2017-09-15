package com.javarush.task.task15.task1529;

public class Plane implements Flyable {
    private static int passagirCount;


    public  Plane (int passagirCount) {
        this.passagirCount = passagirCount;
    //    return passagirCount;
    }
    @Override
    public void fly() {

    }
}
