package curiosity.task1;

import java.io.*;
import java.util.*;

/**
 * Подсчитываем колличество слов в тексте и сортируем по колличеству повторов.
 */

public class CountingWords {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> frequencyMap = new HashMap<>();
        System.out.println("Введите адрес тектового файла");
        BufferedReader f = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        System.out.println("Введите сколько первых слов показать");
        int numberOfRepetitions = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        while (f.ready()) {
            String textLine = f.readLine().toLowerCase();
            String[] textMass = (textLine + " ").split("\\p{P}?[ \\t\\n\\r]+");

            for (int i = 0; i < textMass.length; i++) {
                if (frequencyMap.containsKey(textMass[i]))
                    frequencyMap.put(textMass[i], frequencyMap.get(textMass[i]) + 1);
                else
                    frequencyMap.put(textMass[i], 1);
            }
        }
        f.close();

        List listSorted = new ArrayList(frequencyMap.entrySet());
        Collections.sort(listSorted, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });
        System.out.println("Колличество слов в тексте: " + listSorted.size());
        System.out.println("Как за часто встречаются первые " + numberOfRepetitions + " слов:");
        for (int i = listSorted.size()-1 ; i >= listSorted.size() - numberOfRepetitions ; i--) {
            System.out.println("            " + listSorted.get(i));
        }
    }
}
