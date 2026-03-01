package com.cg.strings;

import java.util.Arrays;

public class LongestSubstringLastIndex {

	private static int MAX_CHAR = 26;

	private static int res = 0;

	static int lonegstUniqueSubstring(String s) {
		int[] lastIndex = new int[MAX_CHAR];
		int n = s.length();
		Arrays.fill(lastIndex, -1);

		int start = 0;

		for (int end = 0; end < n; end++) {

			start = Math.max(start, lastIndex[s.charAt(end) - 'a'] + 1);

			res = Math.max(res, end - start + 1);

			lastIndex[s.charAt(end) - 'a'] = end;
		}

		return res;
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println(lonegstUniqueSubstring(s));
	}
}
