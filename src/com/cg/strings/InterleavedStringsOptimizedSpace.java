package com.cg.strings;

import java.util.Arrays;
import java.util.Scanner;

public class InterleavedStringsOptimizedSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.nextLine();
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		System.out.println("Enter third string");
		String s3 = sc.nextLine();

		if (s1.length() + s2.length() != s3.length()) {
			System.out.println("FALSE");
			return;
		}

		int n = s1.length();
		int m = s2.length();

		int prev[] = new int[m + 1];
		int curr[] = new int[m + 1];

		prev[0] = 1;

		for (int j = 1; j <= m; j++)
			prev[j] = (s2.charAt(j - 1) == s3.charAt(j - 1)) && (prev[j - 1] == 1) ? 1 : 0;

		for (int i = 1; i <= n; i++) {
			curr[0] = (s1.charAt(i - 1) == s3.charAt(i - 1)) && (prev[0] == 1) ? 1 : 0;

			for (int j = 1; j <= m; j++) {
				int k = i + j;
				curr[j] = ((s1.charAt(i - 1) == s3.charAt(k - 1) && prev[j] == 1)
						|| (s2.charAt(j - 1) == s3.charAt(k - 1) && curr[j - 1] == 1)) ? 1 : 0;
			}

			prev = Arrays.copyOf(curr, m + 1);
		}

		System.out.println(curr[m] == 1 ? "TRUE" : "FALSE");
	}
}
