package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.

1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».


*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man m1 = new Man("we",4,"kf");
        System.out.println(m1.name+" "+m1.age+" "+m1.address);
        Man m2 = new Man("Vasya",25,"Kiev");
        System.out.println(m2.name+" "+m2.age+" "+m2.address);

        Woman w1 = new Woman("wer",54,"wef");
        System.out.println(w1.name+" "+w1.age+" "+w1.address);
        Woman w2 = new Woman("Vasilisa",23,"Шостка");
        System.out.println(w2.name+" "+w2.age+" "+w2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;
        public Man(String name){
            this.name=name;
        }
        public Man(String name, int age){
            this.name=name;
            this.age=age;
        }
        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Man( int age, String address){
            this.age=age;
            this.address=address;
        }
        public Man(String name, String address){
            this.name=name;
            this.address=address;
        }
        public Man(int age){
            this.age=age;
        }
        public Man (){this("Бомж");}
    }
    public static class Woman {
        String name;
        int age;
        String address;
        public Woman(String name){
            this.name=name;
        }
        public Woman(String name, int age){
            this.name=name;
            this.age=age;
        }
        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public Woman(int age, String address){
            this.age=age;
            this.address=address;
        }
        public Woman(int age){
            this.age=age;
        }
        public Woman(String name, String address){
            this.name=name;
            this.address=address;
        }
        public Woman(){this("Bitch");}
    }
}
