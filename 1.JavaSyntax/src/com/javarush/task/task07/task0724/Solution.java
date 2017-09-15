package com.javarush.task.task07.task0724;

/* 
Семейная перепись
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      Human ded1= new Human("Vasilich", true, 80);
        System.out.println(ded1.toString());
        Human ded2 = new Human("Petrovich", true, 79);
        System.out.println(ded2.toString());

        Human bab1 = new Human("Egorovna", false, 65);
        System.out.println(bab1.toString());
        Human bab2 = new Human("Fedorovna", false, 70);
        System.out.println(bab2.toString());

        Human mother = new Human("Vasilisa", false, 45, ded1, bab1);
        System.out.println(mother.toString());
        Human father = new Human("Petr", true, 46, ded2, bab2);
        System.out.println(father.toString());

        Human child1 = new Human("Katya", false, 20, father, mother);
        System.out.println(child1.toString());
        Human child2 = new Human("Egor",true,12, father, mother);
        System.out.println(child2.toString());
        Human child3 = new Human("Yaroslava", false, 5, father, mother);
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















