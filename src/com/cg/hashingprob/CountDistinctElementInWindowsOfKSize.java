package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctElementInWindowsOfKSize {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
		int n = arr.length;
		int k = 4;

		List<Integer> res = new ArrayList<>();
		Map<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < k; i++)
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

		res.add(freq.size());

		for (int i = k; i < n; i++) {
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
			freq.put(arr[i - k], freq.get(arr[i - k]) - 1);

			if (freq.get(arr[i - k]) == 0)
				freq.remove(arr[i - k]);

			res.add(freq.size());
		}

		System.out.println(res.toString());
	}

}
