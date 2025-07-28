package com.cg.logicbuilding;

public class KnapsackDPTabulation {

	public static void main(String[] args) {

		int[] val = { 1, 2, 3 };
		int[] wt = { 4, 5, 1 };
		int w = 4;

		int n = val.length;
		int[][] dp = new int[n + 1][w + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else {
					int pick = 0;
					if (wt[i - 1] <= j) {
						pick = val[i - 1] + dp[i - 1][j - wt[i - 1]];
					}

					int notPick = dp[i - 1][j];
					dp[i][j] = Math.max(pick, notPick);
				}
			}
		}
		
		System.out.println(dp[n][w]);
	}
}
