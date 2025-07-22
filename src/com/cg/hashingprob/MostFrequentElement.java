package com.cg.hashingprob;

import java.util.HashMap;

public class MostFrequentElement {

	public static void main(String[] args) {
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		int n = arr.length;

		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
		int maxCnt = 0, res = 1;
		for (var entry : freq.entrySet()) {
			int val = entry.getKey(), cnt = entry.getValue();

			if (maxCnt < cnt || cnt == maxCnt && val > res) {
				res = val;
				maxCnt = cnt;
			}
		}

		System.out.println(res);
	}
}
