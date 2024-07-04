package Lesson_9;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "apple", "orange", "banana", "apple", "kiwi", "banana",
                "grape", "orange", "apple", "kiwi", "peach", "grape",
                "banana", "peach", "kiwi", "mango", "pear", "apple", "banana", "grape"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
