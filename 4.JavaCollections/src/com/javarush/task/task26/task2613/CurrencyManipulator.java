package com.javarush.task.task26.task2613;

import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulator {
    private String currencyCode;                                    //код валюты, например, USD
    private Map<Integer, Integer> denominations = new HashMap<>();  //это Map<номинал, количество>

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        } else {
            denominations.put(denomination, count);
        }
    }
    public int getTotalAmount() {
        int total = 0;
        for (Map.Entry<Integer, Integer> pair : denominations.entrySet()) {
            total += pair.getKey() * pair.getValue();
        }
        return total;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
