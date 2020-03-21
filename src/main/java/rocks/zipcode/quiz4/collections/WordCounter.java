package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[] strings;
    public WordCounter(String... strings) {
        this.strings = strings;
    }
        public Map<String, Integer> getWordCountMap () {

        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (!wordCounter.containsKey(strings[i])) {
                wordCounter.put(strings[i], 1);
            } else {
                Integer count = wordCounter.get(strings[i]) + 1;
                wordCounter.put((strings[i]), count);
            }
        }

        return wordCounter;
    }
}
