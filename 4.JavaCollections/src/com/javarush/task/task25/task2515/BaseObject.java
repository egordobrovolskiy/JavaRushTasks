package com.javarush.task.task25.task2515;

import static sun.swing.MenuItemLayoutHelper.max;

public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public abstract void draw();

    public abstract void move();

    public void die() {
        this.isAlive = false;
    }

    public boolean isIntersect(BaseObject o) {
        return ((o.x - this.x)*(o.x - this.x) + (o.y - this.y)*(o.y - this.y)) <(max((int) o.radius,(int) this.radius)*max((int) o.radius,(int) this.radius));
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
