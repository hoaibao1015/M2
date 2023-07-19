package SS10;

import java.util.*;

public class WordCountUsingMap {
    public static void main(String[] args) {
        String text = "Advanced Programming with Java 2.1 with Java 2.1";

        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordCountMap = new TreeMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Từ '" + entry.getKey() + "' xuất hiện " + entry.getValue() + " lần.");
        }
    }
}

