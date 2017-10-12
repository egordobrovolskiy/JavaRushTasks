package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.*;
import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {

    public void testStorage(Shortener shortener) {
        String text1 = "qwertyuiop";
        String text2 = "asdfghjjkl";
        String text3 = "qwertyuiop";
        Long id1 = shortener.getId(text1);
        Long id2 = shortener.getId(text2);
        Long id3 = shortener.getId(text3);
        String value1 = shortener.getString(id1);
        String value2 = shortener.getString(id2);
        String value3 = shortener.getString(id3);

        Assert.assertNotEquals(id1, id2);
        Assert.assertNotEquals(id3, id2);

        Assert.assertEquals(id1, id3);

        Assert.assertEquals(text1, value1);
        Assert.assertEquals(text2, value2);
        Assert.assertEquals(text3, value3);
    }

    @Test
    public void testHashMapStorageStrategy(){
        StorageStrategy strategy1 = new HashMapStorageStrategy();
        Shortener shortener = new Shortener(strategy1);
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy(){
        StorageStrategy strategyOurHashMap = new OurHashMapStorageStrategy();
        Shortener shortener = new Shortener(strategyOurHashMap);
        testStorage(shortener);

    }

    @Test
    public void testFileStorageStrategy(){
        StorageStrategy strategyFile = new FileStorageStrategy();
        Shortener shortener = new Shortener(strategyFile);
        testStorage(shortener);
    }

    @Test
    public void testHashBiMapStorageStrategy(){
        StorageStrategy strategyHasBiMap = new HashBiMapStorageStrategy();
        Shortener shortener = new Shortener(strategyHasBiMap);
        testStorage(shortener);
    }

    @Test
    public void testDualHashBidiMapStorageStrategy(){
        StorageStrategy strategyDualHashBiMap = new DualHashBidiMapStorageStrategy();
        Shortener shortener = new Shortener(strategyDualHashBiMap);
        testStorage(shortener);
    }

    @Test
    public void testOurHashBiMapStorageStrategy(){
        StorageStrategy strategyOurHasBiMap = new OurHashBiMapStorageStrategy();
        Shortener shortener = new Shortener(strategyOurHasBiMap);
        testStorage(shortener);
    }
}
