package com.javarush.task.task26.task2613;

import com.javarush.task.task26.task2613.exception.NotEnoughMoneyException;

import java.util.*;

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

    public boolean hasMoney() {
        return denominations.size() != 0;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public boolean isAmountAvailable(int expectedAmount) {
        return getTotalAmount() >= expectedAmount;
    }

    public Map<Integer, Integer> withdrawAmount(int expectedAmount) throws NotEnoughMoneyException {
        Map<Integer, Integer> resultMap = new TreeMap<>(Collections.reverseOrder());
        Map<Integer, Integer> tempMap = new HashMap<>(denominations);
        List<Integer> denominationsKeyList = new ArrayList<>(tempMap.keySet());
        Collections.sort(denominationsKeyList, Collections.reverseOrder());

        for(int i = 0; i < denominationsKeyList.size(); i++){
            int nominal = denominationsKeyList.get(i);
            int countOfNominal = tempMap.get(nominal);
            int countOfNominalForPut = 0;

            for(int k = 0; k < countOfNominal; k++){
                if(expectedAmount >= nominal){
                    countOfNominalForPut++;
                    expectedAmount -= nominal;
                }else{
                    break;
                }
            }
            if(countOfNominalForPut != 0)
            {
                if (countOfNominal - countOfNominalForPut == 0)
                {
                    tempMap.remove(nominal);
                } else
                {
                    tempMap.put(nominal, countOfNominal - countOfNominalForPut);
                }
                resultMap.put(nominal, countOfNominalForPut);
            }
        }
        if(expectedAmount != 0) throw new NotEnoughMoneyException();

        denominations.clear();
        denominations.putAll(tempMap);

        return resultMap;
    }
}