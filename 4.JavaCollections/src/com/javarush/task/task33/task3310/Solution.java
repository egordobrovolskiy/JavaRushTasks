package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        StorageStrategy strategy1 = new HashMapStorageStrategy();
        testStrategy(strategy1, 10000);

        StorageStrategy strategyOurHashMap = new OurHashMapStorageStrategy();
        testStrategy(strategyOurHashMap, 10000);

//        StorageStrategy strategyFile = new FileStorageStrategy();
//        testStrategy(strategyFile, 1000);

        StorageStrategy strategyOurHasBiMap = new OurHashBiMapStorageStrategy();
        testStrategy(strategyOurHasBiMap, 10000);

        StorageStrategy strategyHasBiMap = new HashBiMapStorageStrategy();
        testStrategy(strategyHasBiMap, 10000);

        StorageStrategy strategyDualHashBiMap = new DualHashBidiMapStorageStrategy();
        testStrategy(strategyDualHashBiMap, 10000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> result = new HashSet<>();
        for (String string : strings) {
            result.add(shortener.getId(string));
        }
        return result;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> result = new HashSet<>();
        for (Long id : keys) {
            result.add(shortener.getString(id));
        }
        return result;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage("Стратегия: " + strategy.getClass().getSimpleName());
        Set<String> strings = new HashSet<>();
        Set<Long> setIds;
        Set<String> stringsControl;
        for (int i =0; i < elementsNumber; i++) {
            strings.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);
            Date startId = new Date();
            setIds = getIds(shortener, strings);
            Date endId = new Date();
            Helper.printMessage(String.valueOf(endId.getTime() - startId.getTime()));

            Date startString = new Date();
            stringsControl = getStrings(shortener, setIds);
            Date endString = new Date();
            Helper.printMessage(String.valueOf(endString.getTime() - startString.getTime()));

        if (strings.size() == stringsControl.size()) {
            Helper.printMessage("Тест пройден.");
        } else {
            Helper.printMessage("Тест не пройден.");
        }
    }
}
