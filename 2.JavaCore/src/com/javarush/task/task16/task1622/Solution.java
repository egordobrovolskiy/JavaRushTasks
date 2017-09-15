package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей
1. Программа должна создавать 4 объекта типа SleepingThread.
2. Метод main должен вызвать join у каждой создаваемой SleepingThread нити.
3. Метод run должен использовать Thread.sleep(10).
4. Вывод программы должен соответствовать условию.
5. Если нить SleepingThread прерывается, она должна вывести сообщение "Нить прервана".
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //напишите тут ваш код
      //      Thread.currentThread().join();

        }

    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }


        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDownIndex == 0) break;
                //напишите тут ваш код
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}
