package com.cg.numberproblems;

import java.util.Arrays;

public class KnapsackSubsetSumMemoization {

	static int subsetRecur(int[] coins, int n, int sum, int[][] memo) {
		if (sum == 0)
			return 1;

		if (sum < 0 || n == 0)
			return 0;

		if (memo[n - 1][sum] != -1)
			return memo[n - 1][sum];

		return memo[n - 1][sum] = subsetRecur(coins, n, sum - coins[n - 1], memo)
				+ subsetRecur(coins, n - 1, sum, memo);
	}

	public static void main(String[] args) {
		int coins[] = { 1, 2, 3 };
		int sum = 5;
		int[][] memo = new int[coins.length][sum + 1];
		for (int[] row : memo)
			Arrays.fill(row, -1);

		System.out.println(subsetRecur(coins, coins.length, sum, memo));
	}
}
