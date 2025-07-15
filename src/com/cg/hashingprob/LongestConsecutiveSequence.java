package com.cg.hashingprob;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 1, 9, 4, 5, 3 };

		Set<Integer> set = new HashSet<>();

		for (int x : arr)
			set.add(x);

		int res = 0;

		for (int val : arr) {
			if (set.contains(val) && !set.contains(val - 1)) {
				int curr = val, count = 0;
				while (set.contains(curr)) {
					set.remove(curr);
					curr++;
					count++;
				}
				res = Math.max(count, res);
			}
		}

		System.out.println("Longest consecutive sequence is: " + res);
	}

}
