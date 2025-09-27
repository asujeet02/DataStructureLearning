package com.cg.strings;

import java.util.Arrays;

public class WordBreakProblem {

	static boolean wordBreakRec(int ind, String s, String[] dict, int[] dp) {
		if (ind >= s.length())
			return true;

		if (dp[ind] != -1)
			return dp[ind] == 1;

		boolean possible = false;
		for (String temp : dict) {
			if (temp.length() > s.length() - ind)
				continue;
			boolean ok = true;
			int k = ind;

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) != s.charAt(k)) {
					ok = false;
					break;
				}
				k++;
			}

			if (ok) {
				possible |= wordBreakRec(ind + temp.length(), s, dict, dp);
			}
		}
		dp[ind] = possible ? 1 : 0;
		return possible;
	}

	public static void main(String[] args) {
		String s = "ilike";

		String[] dict = { "i", "like", "gfg" };
		int n = s.length();
		int dp[] = new int[n + 1];
		Arrays.fill(dp, -1);

		System.out.println(wordBreakRec(0, s, dict, dp) ? "true" : "false");
	}
}
