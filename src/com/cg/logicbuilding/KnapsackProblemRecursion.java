package com.cg.logicbuilding;

public class KnapsackProblemRecursion {

	static int knapSackRec(int w, int[] val, int[] wt, int n) {
		if (n == 0 || w == 0)
			return 0;
		int pick = 0;
		if (wt[n - 1] <= w)
			pick = val[n - 1] + knapSackRec(w - wt[n - 1], val, wt, n - 1);
		int notPick = knapSackRec(w, val, wt, n - 1);

		return Math.max(pick, notPick);
	}

	public static void main(String[] args) {
		int[] val = { 1, 2, 3 };
		int[] wt = { 4, 5, 1 };
		int w = 4;

		System.out.println(knapSackRec(w, val, wt, val.length));
	}

}
