package com.cg.strings;

import java.util.Scanner;

public class RotatingStrings {

	static int[] computeLpsArrays(String pat) {
		int n = pat.length();
		int[] lps = new int[n];

		int len = 0;
		lps[0] = 0;

		int i = 1;
		while (i < n) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}

			else {
				if (len != 0)
					len = lps[n - 1];

				else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.nextLine();

		System.out.println("Enter second string");
		String s2 = sc.nextLine();

		String text = s1 + s1;
		String pat = s2;

		int n = text.length();
		int m = pat.length();

		int[] lps = computeLpsArrays(pat);

		int i = 0;
		int j = 0;

		while (i < n) {
			if (pat.charAt(j) == text.charAt(i)) {
				j++;
				i++;
			}

			if (j == m) {
				System.out.println(s2 + " is a pattern of " + s1);
				return;
			}

			else if (i < n && pat.charAt(j) != text.charAt(i))
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
		}

		System.out.println(s2 + " isn't a pattern of " + s1);
	}

}
