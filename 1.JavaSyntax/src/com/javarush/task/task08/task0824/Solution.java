package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        Human mother = new Human();
        Human father = new Human();
        Human ded1 = new Human();
        Human ded2 = new Human();
        Human bab1 = new Human();
        Human bab2 = new Human();


        child1.name="Sasha";
        child1.age=20;
        child1.sex=true;
        child2.name="Sveta";
        child2.age=12;
        child2.sex=false;
        child3.name="Jeka";
        child3.age=6;
        child3.sex=true;

        father.name="Petya";
        father.age = 40;
        father.sex = true;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        mother.name = "Olga";
        mother.age = 38;
        mother.sex = false;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);


        ded1.name = "Petrovic";
        ded1.age = 78;
        ded1.sex = true;
        ded1.children.add(mother);
        bab1.name = "Vasilevna";
        bab1.age = 70;
        bab1.sex = false;
        bab1.children.add(mother);


        ded2.name = "Ivanuc";
        ded2.age = 86;
        ded2.sex = true;
        ded2.children.add(father);
        bab2.name = "Petrovna";
        bab2.age = 76;
        bab2.sex = false;
        bab2.children.add(father);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
