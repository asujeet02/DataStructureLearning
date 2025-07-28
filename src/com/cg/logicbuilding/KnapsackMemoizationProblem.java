package com.cg.logicbuilding;

import java.util.Arrays;

public class KnapsackMemoizationProblem {

	static int knapsackRecursion(int w, int[] val, int[] wt, int n, int[][] memo) {
		if (n == 0 || w == 0)
			return 0;

		if (memo[n][w] != -1)
			return memo[n][w];

		int pick = 0;
		if (wt[n - 1] <= w)
			pick = val[n - 1] + knapsackRecursion(w - wt[n - 1], val, wt, n - 1, memo);

		int notPick = knapsackRecursion(w, val, wt, n - 1, memo);
		return memo[n][w] = Math.max(pick, notPick);
	}

	public static void main(String[] args) {
		int[] val = { 1, 2, 3 };
		int[] wt = { 4, 5, 1 };
		int w = 4;
		int n = val.length;

		int[][] memo = new int[n + 1][w + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= w; j++)
				memo[i][j] = -1;

		System.out.println(knapsackRecursion(w, val, wt, n, memo));
	}
}
