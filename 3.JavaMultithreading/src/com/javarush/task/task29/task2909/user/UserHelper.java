package com.javarush.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private User userAnya = new User("Аня", "Смирнова", 10);
    private User userRoma = new User("Рома", "Виноградов", 30);

    private boolean isManAnya = false;
    private boolean isManRoma = true;


    public void printUsers() {
        userAnya.printInfo();
        userAnya.printAdditionalInfo();

        userRoma.printInfo();
        userRoma.printAdditionalInfo();
    }

//    public void printAdditionalInfo(User user) {
//        if (ageLessThan16(user))
//            System.out.println("Пользователь моложе 16 лет");
//        else
//            System.out.println("Пользователь старше 16 лет");
//    }

//    private boolean ageLessThan16(User user) {
//        if (user.getAge() < 16) {
//            return true;
//        }
//        return false;
//    }

    public int calculateAverageAge() {

        User userUra = new User("Юра", "Карп", 28);

        return  ((userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3);

    }

    public int calculateRate(AtomicInteger base, int age, boolean hasWork, boolean hasHouse) {
//        int x;
//        base.set(base.get() + getAge() / 100);
//        base.set((int) (base.get() * (hasWork ? 1.1 : 0.9)));
//        base.set((int) (base.get() * (hasHouse ? 1.1 : 0.9)));
//        return 0;
        int i = (base.get() + age / 100);
        i = (int) (i * (hasWork ? 1.1 : 0.9));
        i = (int) (i * (hasHouse ? 1.1 : 0.9));
        return i;
    }

    public String getBossName(User user) {
        Work work = user.getWork();
        return work.getBoss();
    }
}