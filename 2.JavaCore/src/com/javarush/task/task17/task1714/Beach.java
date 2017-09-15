package com.javarush.task.task17.task1714;

/* 
Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботьтесь,
чтобы все методы были синхронизированы.

Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число, которое показывает что
первый пляж лучше(позитивное число)
или второй пляж лучше (негативное число),и насколько он лучше.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public synchronized static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
       // float dist = (this.distance + o.distance)/2;
       // int qual = (this.quality + o.quality)/2;
       // int sr1 = (int) (dist - this.distance + this.quality - qual);
       // int sr2 = (int) (dist - o.distance + o.quality - qual);
        return (int) (this.quality - o.quality + o.distance - this.distance);
    }
}
