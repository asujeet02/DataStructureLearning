package com.cg.hashingprob;

import java.util.HashMap;

public class ArraysDividedIntoPairsWithSumDivisibleByK {

	public static void main(String[] args) {
		int[] arr = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		if (arr.length % 2 == 1)
			System.out.println("An array with odd length cannot be divided into pairs");

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int rem = ((arr[i] % k) + k) % k;
			if (!hm.containsKey(rem))
				hm.put(rem, 0);
			hm.put(rem, hm.get(rem) + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			int rem = ((arr[i] % k) + k) % k;

			if (2 * rem == k) {
				if (hm.get(rem) % 2 == 1)
					System.out.println("There's no even occurences for the given pair");
			}

			else if (rem == 0) {
				if (hm.get(rem) % 2 == 1)
					System.out.println("There's no even occurences for the given pair");
			}

			else {
				if (hm.get(k - rem) != hm.get(rem))
					System.out.println("There's no even occurences for the given pair");
			}
		}
		System.out.println("Array can be divided into pairs with sum divisible by " + k);
	}

}
