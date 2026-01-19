package com.cg.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicateCharacter {

	public static void main(String[] args) {
		String input1 = "swiss";
		String input2 = "teeter";
		String input3 = "aabbcc";

		findFirstNonDuplicate(input1);
		findFirstNonDuplicate(input2);
		findFirstNonDuplicate(input3);
	}

	private static void findFirstNonDuplicate(String str) {
		Map<Character, Long> counts = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Optional<Character> firstNonDup = counts.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey).findFirst();

		if (firstNonDup.isPresent())
			System.out.println("Input: \"" + str + "\" Output: " + firstNonDup.get());
		else
			System.out.println("Input: \"" + str + "\" Output: No non-duplicate character found!" );
	}
}
