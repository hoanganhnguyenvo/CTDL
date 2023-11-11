package Lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {
	// <word, its positions>
	private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

	// load words in the text file given by fileName and store into map by using add
	// method in Task 2.1.
	// Using BufferedReader reffered in file TextFileUtils.java
	public void load(String fileName) {
		// TODO
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			int position = 1;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				for (String word : words) {
					add(word, position);
					position++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// In the following method, if the word is not in the map, then adding that word
	// to the map containing the position of the word in the file. If the word is
	// already in the map, then its word position is added to the list of word
	// positions for this word.
	// Remember to negate the word position if the word is at the end of a line in
	// the text file

	public void add(String word, int position) {
		map.computeIfAbsent(word, k -> new ArrayList<>()).add(position);
	}

	// This method should display the words of the text file along with the
	// positions of each word, one word per line, in alphabetical order
	public void displayWords() {
		// TODO
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
	}

	// This method will display the content of the text file stored in the map
	public void displayText() {
		// TODO
		map.forEach((word, positions) -> {
			System.out.print(word + " ");
			for (int position : positions) {
				System.out.print(position + " ");
			}
			System.out.println();
		});
	}

	// This method will return the word that occurs most frequently in the text file
	public String mostFrequentWord() {
		// TODO
		int maxOccurrences = 0;
		String mostFrequent = null;
		for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
			int occurrences = entry.getValue().size();
			if (occurrences > maxOccurrences) {
				maxOccurrences = occurrences;
				mostFrequent = entry.getKey();
			}
		}
		return mostFrequent;
	}

}
