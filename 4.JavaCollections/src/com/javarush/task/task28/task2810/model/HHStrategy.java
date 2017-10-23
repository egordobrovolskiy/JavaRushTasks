package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HHStrategy implements Strategy {

    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";


    @Override
    public List<Vacancy> getVacancies(String searchString) {
        List<Vacancy> vacancies = new ArrayList<>();
        if (searchString == null)
            return Collections.emptyList();
        try {
            Document doc = Jsoup.connect(URL_FORMAT).userAgent("Chrome (jsoup)").referrer("?").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vacancies;
    }

//    String url = String.format(URL_FORMAT, "Kiev", 3);
}