package com.javarush.task.task26.task2613;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {

    private static Map<String, CurrencyManipulator> map = new HashMap<>();

    private CurrencyManipulatorFactory() {}

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        String currencyCodeUp = currencyCode.toUpperCase();
        if (!map.containsKey(currencyCodeUp)) {
            CurrencyManipulator manipulator = new CurrencyManipulator(currencyCodeUp);
            map.put(currencyCodeUp, manipulator);
            return manipulator;
        }
        return map.get(currencyCodeUp);
    }
}
