package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        writeMessage("Выберите и запишите блюда, после выбора напишите 'exit");
        writeMessage(Dish.allDishesToString());
        while (true) {
            String textOrder = readString();
            if (textOrder.equals("exit")) {
                break;
            }
            if (textOrder.isEmpty()) {
                writeMessage("Повторите ваш заказ");
                continue;
            }
            for (Dish d : Dish.values()) {
                if (d.name().equalsIgnoreCase(textOrder)) {
                    dishes.add(d);
                } else writeMessage("Такого блюда нет");
            }

        }
        return dishes;
    }
}
