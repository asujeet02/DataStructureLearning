package com.cg.hashingprob;

import java.util.HashMap;
import java.util.Map;

public class CountTripletsWithGivenSumInAnArray {

	static int getPairsCount(int[] arr, int index, int target) {
		Map<Integer, Integer> freq = new HashMap<>();
		int count = 0;

		for (int i = index; i < arr.length; i++) {
			if (freq.containsKey(target - arr[i]))
				count += freq.get(target - arr[i]);

			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int target = -2;
		int cnt = 0;
		int n = arr.length;

		for (int i = 0; i < n - 2; i++) {
			int rem = target - arr[i];
			cnt += getPairsCount(arr, i + 1, rem);
		}
		System.out.println("The number of triplets with target sum is: " + cnt);
	}
}
