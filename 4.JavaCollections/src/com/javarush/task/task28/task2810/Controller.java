package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private Provider[] providers;

    public Controller (Provider... providers) throws IllegalArgumentException {
        if (providers == null || providers.length == 0) throw new IllegalArgumentException();
        this.providers = providers;
    }


    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {
        List<Vacancy> list = new ArrayList<>();
        for (int i=0;i<providers.length;i++){
            for (Vacancy vacancy : providers[i].getJavaVacancies("")){
                list.add(vacancy);
            }
        }
        System.out.println(list.size());
    }
}

