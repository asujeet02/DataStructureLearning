package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class WordsWithSameSetsOfCharacters {

	private static final int MAX_CHAR = 26;

	static String getKey(String str) {
		boolean[] visited = new boolean[MAX_CHAR];

		Arrays.fill(visited, false);

		for (int i = 0; i < str.length(); i++)
			visited[str.charAt(i) - 'a'] = true;
		String key = "";

		for (int j = 0; j < MAX_CHAR; j++)
			if (visited[j])
				key += (char) ('a' + j);

		return key;
	}

	static void wordsWithSameCharSet(String[] word, int n) {
		HashMap<String, ArrayList<Integer>> hash = new HashMap<String, ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			String key = getKey(word[i]);

			if (hash.containsKey(key)) {
				ArrayList<Integer> getValue = hash.get(key);
				getValue.add(i);
				hash.put(key, getValue);
			}

			else {
				ArrayList<Integer> getValue = new ArrayList<Integer>();
				getValue.add(i);
				hash.put(key, getValue);
			}
		}

		for (Entry<String, ArrayList<Integer>> it : hash.entrySet()) {
			ArrayList<Integer> getValue = it.getValue();

			for (Integer v : getValue)
				System.out.print(word[v] + ", ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[] words = {"may","student","students","dog","studentsses","god","cat", "act", "tab",
                "bat", "flow", "wolf", "lambs", "amy", "yam",
                "balms", "looped", "poodle"};
		
		int n=words.length;
		
		wordsWithSameCharSet(words, n);
	}

}
