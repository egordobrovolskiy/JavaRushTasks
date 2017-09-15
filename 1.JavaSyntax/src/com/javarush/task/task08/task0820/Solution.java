package com.javarush.task.task08.task0820;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных1.
Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных — всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();

        //напишите тут ваш код
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> dog = new HashSet<>();
        dog.add(new Dog());
        dog.add(new Dog());
        dog.add(new Dog());
        return dog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
      //  HashSet<Object> pets2 = new HashSet<>(pets);
        pets.removeAll(cats);
     /*   for (Object x: pets){
            if (pets.contains(cats)){
                pets.remove(cats);
            }
        }
        */
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x: pets){
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}
}
