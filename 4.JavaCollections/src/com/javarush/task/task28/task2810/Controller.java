package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
//    private Provider[] providers;
    private Model model;

//    public Controller (Provider... providers) throws IllegalArgumentException {
//        if (providers == null || providers.length == 0) throw new IllegalArgumentException();
//        this.providers = providers;
//    }

    public Controller(Model model) throws IllegalArgumentException {
        if (model == null) {
            throw new IllegalArgumentException("Illegal arguments");
        }
        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }


//    @Override
//    public String toString() {
//        return "Controller{" +
//                "providers=" + Arrays.toString(providers) +
//                '}';
//    }

//    public void scan() {
//        List<Vacancy> list = new ArrayList<>();
//        for (int i=0;i<providers.length;i++){
//            for (Vacancy vacancy : providers[i].getJavaVacancies("")){
//                list.add(vacancy);
//            }
//        }
//        System.out.println(list.size());
//    }
}

