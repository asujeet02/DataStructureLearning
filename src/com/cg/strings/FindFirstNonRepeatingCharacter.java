package com.cg.strings;

import java.util.Arrays;

public class FindFirstNonRepeatingCharacter {

	static String s = "aabbccc";
	static int MAX_CHAR = 26;

	public static void main(String[] args) {

		int vis[] = new int[MAX_CHAR];

		Arrays.fill(vis, -1);

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (vis[index] == -1)
				vis[index] = i;
			else
				vis[index] = -2;
		}

		int idx = -1;

		for (int i = 0; i < MAX_CHAR; i++)
			if (vis[i] > 0 && (idx == -1 || vis[i] < vis[idx]))
				idx = i;

		System.out.println((idx == -1) ? '$' : s.charAt(vis[idx]));

	}

}
