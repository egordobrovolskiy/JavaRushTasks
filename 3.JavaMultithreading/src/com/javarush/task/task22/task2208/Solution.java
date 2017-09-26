package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}

Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args) {

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());


        return result.toString();
    }
}
