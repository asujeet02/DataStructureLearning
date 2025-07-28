package com.cg.hashingprob;

public class ArraysDividedIntoPairsWithSumDivisibleByKEfficientApproach {

	public static void main(String[] args) {
		int[] arr = { 92, 75, 65, 48, 45, 35 };
		int k = 10;
		if (arr.length % 2 == 1)
			System.out.println("An array with odd length cannot be divided into pairs");

		int freq[] = new int[k];

		for (int x : arr) {
			int rem = x % k;
			if (freq[(k - rem) % k] != 0)
				freq[(k - rem) % k]--;
			else
				freq[rem]++;
		}

		for (int count : freq) {
			if (count != 0)
				System.out.println("Array cannot be divided into pairs with sum divisible by " + k);
		}
		System.out.println("Array can be divided into pairs with sum divisible by " + k);
	}

}
