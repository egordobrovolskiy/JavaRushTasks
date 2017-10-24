package com.javarush.task.task26.task2613;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {

    private static Map<String, CurrencyManipulator> currencyMap = new HashMap<>();

    private CurrencyManipulatorFactory() {}

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
        if (!currencyMap.containsKey(currencyCode)) {
            currencyMap.put(currencyCode, new CurrencyManipulator(currencyCode));
        }
        return currencyMap.get(currencyCode);
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return currencyMap.values();
    }
}
