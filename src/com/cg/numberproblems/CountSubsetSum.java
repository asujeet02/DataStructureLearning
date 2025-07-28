package com.cg.numberproblems;

public class CountSubsetSum {

	static int knapsackRecursion(int[] coins, int n, int sum) {
		if (sum == 0)
			return 1;
		if (sum < 0 || n == 0)
			return 0;

		return knapsackRecursion(coins, n, sum - coins[n - 1]) + knapsackRecursion(coins, n - 1, sum);

	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 3 };
		int sum = 5;
		System.out.println(knapsackRecursion(coins, coins.length, sum));
	}

}
