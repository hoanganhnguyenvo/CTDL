package Lab7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
    public static final String fileName = "data/fit.txt"; // assuming file is in the "data" directory
    private List<String> words = new ArrayList<>();
    private HashMap<String, Integer> wordCounts = new HashMap<>();
    
    public MyWordCount() {
        try {
            this.words.addAll(Utils.loadWords(fileName));
            for(String word : this.words) {
                if(wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word)+1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public List<WordCount> getWordCounts() {
        List<WordCount> wordCountsList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            wordCountsList.add(new WordCount(entry.getKey(), entry.getValue()));
        }
        Collections.sort(wordCountsList, Comparator.comparingInt(wc -> wc.getWord().charAt(0)));
        return wordCountsList;
    }

    public Set<String> getUniqueWords() {
        Set<String> uniqueWords = new HashSet<>();
        for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if(entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }
        return uniqueWords;
    }

    public Set<String> getDistinctWords() {
        return wordCounts.keySet();
    }

    public Set<WordCount> exportWordCounts() {
        TreeSet<WordCount> sortedWordCounts = new TreeSet<>(Comparator.comparing(WordCount::getWord));
        sortedWordCounts.addAll(getWordCounts());
        return sortedWordCounts;
    }

    public Set<WordCount> exportWordCountsOrderByOccurence() {
        TreeSet<WordCount> sortedWordCounts = new TreeSet<>(Comparator.comparing(WordCount::getCount).reversed());
        sortedWordCounts.addAll(getWordCounts());
        return sortedWordCounts;
    }

    public Set<WordCount> filterWords(String pattern) {
        for (Iterator<Map.Entry<String, Integer>> it = wordCounts.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getKey().startsWith(pattern)) {
                it.remove();
            }
        }
        return exportWordCounts();
    }
}