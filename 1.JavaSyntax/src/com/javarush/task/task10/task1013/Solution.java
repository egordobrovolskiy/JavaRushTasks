package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private int rost;
        private String color;
        private boolean deti;

        //1
        public Human(String name, int age, boolean sex, int rost, String color, boolean deti){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=deti;
        }
        //2
        public Human(String name, int age, boolean sex, int rost, String color){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=false;
        }
        //3
        public Human(String name, int age, boolean sex, int rost, boolean deti){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.rost=rost;
            this.color="white";
            this.deti=deti;
        }
        //4
        public Human(String name, int age, boolean sex, String color, boolean deti){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.rost=165;
            this.color=color;
            this.deti=deti;
        }
        //5
        public Human(String name, int age, int rost, String color, boolean deti){
            this.name=name;
            this.age=age;
            this.sex=true;
            this.rost=rost;
            this.color=color;
            this.deti=deti;
        }
        //6
        public Human(String name, boolean sex, int rost, String color, boolean deti){
            this.name=name;
            this.age=25;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=deti;
        }
        //7
        public Human(int age, boolean sex, int rost, String color, boolean deti){
            this.name="Vaska";
            this.age=age;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=deti;
        }
        //8
        public Human(boolean sex, int rost, String color, boolean deti){
            this.name="Vaska";
            this.age=25;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=deti;
        }
        //9
        public Human(String name, boolean sex, int rost, String color){
            this.name=name;
            this.age=15;
            this.sex=sex;
            this.rost=rost;
            this.color=color;
            this.deti=false;
        }
        //10
        public Human(){
            this.name="Nikto";
            this.age=30;
            this.sex=false;
            this.rost=165;
            this.color="gray";
            this.deti=false;
        }
    }
}
