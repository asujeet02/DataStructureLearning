package com.cg.hashingprob;

import java.util.HashMap;

public class SmallestDistinctKSubArrays {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5 };
		int n = arr.length;
		int k = 3;

		int start = 0, end = n;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0, j = 0;

		while (j < n) {
			map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
			j++;

			if (map.size() < k)
				continue;

			while (map.size() == k) {
				int windowLen = (j - 1) - i + 1;
				int subArrayLen = end - start + 1;

				if (windowLen < subArrayLen) {
					start = i;
					end = j - 1;
				}

				if (map.get(arr[i]) == 1)
					map.remove(arr[i]);

				else
					map.put(arr[i], map.get(arr[i]) - 1);
				i++;
			}
		}
		if (start == 0 && end == n)
			System.out.println("-1");
		else
			System.out.println(start + " " + end);
	}
}
