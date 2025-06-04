package com.cg.searchingprob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyMoreThanNByK {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 2, 1, 2, 3, 3 };
		System.out.println("Enter the value of K");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		Map<Integer, Integer> freq = new HashMap<>();

		for (int x : arr) {
			freq.put(x, freq.getOrDefault(x, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			if (entry.getValue() > (arr.length / k))
				System.out.print(entry.getKey() + " ");
		}
	}

}
