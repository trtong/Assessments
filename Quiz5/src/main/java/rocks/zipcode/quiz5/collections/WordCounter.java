package rocks.zipcode.quiz5.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> words = new HashMap<>();
    public WordCounter(String... strings) {
        for (String s :strings
             ) {
            if (!words.keySet().contains(s)) {
                words.put(s, 1);
            } else {
                words.put(s, words.get(s) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return words;
    }
}
