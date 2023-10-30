package challenge31;

import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String str) {
        String[] words = str.toLowerCase().split("[\\s,.;:!?()]+");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > 0) {
                if (wordCount.containsKey(word)) {
                    return word;
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
        return "No repeated words found";
    }
}
