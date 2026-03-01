package com.cg.strings;

public class LongestNonRepeatingSubstring {

	private static int MAX_CHAR = 26;

	static int longestUniqueSubstring(String s) {
		if (s.length() == 0 || s.length() == 1)
			return s.length();

		int res = 0;
		boolean[] vis = new boolean[MAX_CHAR];

		int left = 0, right = 0;
		while (right < s.length()) {
			while (vis[s.charAt(right) - 'a'] == true) {
				vis[s.charAt(left) - 'a'] = false;
				left++;
			}

			vis[s.charAt(right) - 'a'] = true;

			res = Math.max(res, right - left + 1);
			right++;
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";

		System.out.println(longestUniqueSubstring(s));
	}
}
