package com.javarush.task.task10.task1011;

/* 
Большая зарплата

Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i=0;i<40;i++){
            System.out.println(s.substring(i).trim());
        }


     /*     int stop = 0;
            for (int i=0;i<40; i++ ){
            for (int k =i; k<myCh.length; k++){
                System.out.print(myCh[k]);
            }
            stop++;
            if(stop==40) break;
            System.out.println();
            for (int k =i; k<myCh.length-2; k++){
                System.out.print(myCh[k+2]);
            }
            stop++;
            if(stop==40) break;
            System.out.println();
            for (int k =i; k<myCh.length-2; k++){
                System.out.print(myCh[k+2]);
            }
            stop++;
            if(stop==40) break;
            System.out.println();
            i=i+2;
           // if(i==myCh.length-1) i=0;
        }
       char[] myCh = s.toCharArray();
        int stop = 0;
        for (int i =1; i<myCh.length; i++){
            if(myCh[i]==32){
                for (int k=i-1;k<myCh.length;k++){
                    System.out.print(myCh[k]);
                }
                stop++;
                if(stop==40) break;
                System.out.println();
                for (int k=i+1; k<myCh.length;k++){
                    System.out.print(myCh[k]);
                }
                stop++;
                if(stop==40) break;
                System.out.println();
                for (int k=i+1; k<myCh.length;k++){
                    System.out.print(myCh[k]);
                }
                stop++;
                if(stop==40) break;
                System.out.println();
            }
            if(i==myCh.length-1) i=0;
        }
        */

        //напишите тут ваш код
    }

}

