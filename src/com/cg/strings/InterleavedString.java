package com.cg.strings;

import java.util.Scanner;

public class InterleavedString {

	static boolean interLeaveRecursion(String s1, String s2, String s3, int i, int j) {
		int k = i + j;

		if (i == s1.length() && j == s2.length() && k == s3.length())
			return true;

		boolean a = (i < s1.length()) && (s3.charAt(k) == s1.charAt(i) && (interLeaveRecursion(s1, s2, s3, i + 1, j)));
		boolean b = (j < s2.length()) && (s3.charAt(k) == s2.charAt(j) && (interLeaveRecursion(s1, s2, s3, i, j + 1)));

		return a || b;
	}

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
		System.out.println(interLeaveRecursion(s1, s2, s3, 0, 0) ? "TRUE" : "FALSE");
	}
}
