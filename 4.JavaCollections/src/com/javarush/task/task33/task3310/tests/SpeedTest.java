package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {

    public long getTimeForGettingIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        Date start = new Date();
        for (String value : strings) {
            ids.add(shortener.getId(value));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    public long getTimeForGettingStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        Date start = new Date();
        for (Long id : ids) {
            strings.add(shortener.getString(id));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());
        Set<String> origStrings = new HashSet<>();
        Set<Long> ids = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());
        }

        long timeIdHasMap = getTimeForGettingIds(shortener1, origStrings, ids);
        long timeIdHasBiMap = getTimeForGettingIds(shortener2, origStrings, ids);
        Assert.assertNotEquals(timeIdHasBiMap, timeIdHasMap);

        long timeValueHasMap = getTimeForGettingStrings(shortener1, ids, origStrings);
        long timeValueHasBiMap = getTimeForGettingStrings(shortener2, ids, origStrings);
        Assert.assertEquals(timeValueHasBiMap, timeValueHasMap, 30);
    }
}
