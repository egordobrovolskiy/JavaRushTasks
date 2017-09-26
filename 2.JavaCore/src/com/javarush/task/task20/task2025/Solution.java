package com.javarush.task.task20.task2025;

/*
Алгоритмы-числа
Число S состоит из M цифр, например, S=370 и M (количество цифр) = 3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания.
Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8
На выполнение дается 10 секунд и 50 МБ памяти.
Требования:
1. В классе Solution должен присутствовать метод getNumbers c одним параметром типа long.
2. Метод getNumbers должен быть публичным.
3. Метод getNumbers должен быть статическим.
4. Метод getNumbers должен возвращать массив чисел удовлетворяющих условию задачи.
*/


import java.util.*;

public class Solution {


/*    static {
        pows[1][0] = 0; pows[1][1] = 1; pows[1][2] = 2; pows[1][3] = 3;
        pows[1][4] = 4; pows[1][5] = 5; pows[1][6] = 6; pows[1][7] = 7;
        pows[1][8] = 8; pows[1][9] = 9;

        for (int i = 2; i < 20; i++) {
            for (int j = 1; j < 10; j++) {
                pows[i][j] = pows[i - 1][j] * j;
            }
        }
    }*/

    private static int getRazr(long num){
        int count = 0;
        do {
            count++;
        }while((num /= 10 ) > 0);

        return count;
    }

    private static long getSum(long num, long[][] pows){
        long sum = 0;
        int raz = getRazr(num);

        for (long i = num; i > 0; i /= 10) {
            sum += pows[raz][(int)(i % 10)];
        }

        return sum;
    }

    static boolean isNeedCalc(long N){
        long num = N / 10;
        long last = num % 10;

        while (num > 0) {
            if (num % 10 <= last) {
                last = num % 10;
                if (last == 0) {
                    last = 10;
                }
                num = num / 10;
            } else {
                return false;
            }
        }

        return true;
    }

    public static long[] getNumbers(long N) {
        long[] result = null;

        List<Long> list = new ArrayList<>();
        long[][] pows = new long[20][10];

        pows[1][0] = 0; pows[1][1] = 1; pows[1][2] = 2; pows[1][3] = 3;
        pows[1][4] = 4; pows[1][5] = 5; pows[1][6] = 6; pows[1][7] = 7;
        pows[1][8] = 8; pows[1][9] = 9;

        for (int i = 2; i < 20; i++) {
            for (int j = 1; j < 10; j++) {
                pows[i][j] = pows[i - 1][j] * j;
            }
        }

        long sum, sum_sum;

        for (long i = 1; i < N; i++) {
            if (isNeedCalc(i)) {
                sum = getSum(i, pows);

                if (sum < N) {
                    sum_sum = getSum(sum, pows);

                    if (sum == sum_sum && getRazr(sum) == getRazr(sum_sum)) {
                        boolean find = false;
                        for (int j = 0; j < list.size(); j++) {
                            if (list.get(j) == sum) {
                                find = true;
                                break;
                            }
                        }

                        if (!find) {
                            list.add(sum);
                        }
                    }
                }
            }
        }

        int size = list.size();
        result = new long[size];
        Collections.sort(list);
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        long memoryStart = Runtime.getRuntime().freeMemory();
        long startTime = System.currentTimeMillis();

        long[] mas = getNumbers(146511208);
        //long[] mas = getNumbers(Long.MAX_VALUE);

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        long estimatedTime = System.currentTimeMillis() - startTime;

        long totalMem = Runtime.getRuntime().totalMemory();

        System.out.println();
        System.out.println(String.format("Mem : %.2f  Mb.", 1.0 * (totalMem - memoryStart )/ (1024 * 1024)));
        System.out.println(String.format("Time: %.3f sec.", estimatedTime / 1000.0));

        int[] res = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153};
        boolean isTrue = true;
        for (int i = 0; i < mas.length; i++) {

            if (i < res.length) {
                if (mas[i] != res[i]) {
                    isTrue = false;
                    System.out.println("Absent : " + res[i]);
                }
            }else{
                System.out.println("Added : " + mas[i]);
            }
        }

        if (isTrue){
            System.out.println("Cool result");
        }

    }
}