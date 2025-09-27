package com.cg.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringPermutations {

	static void recursivePermutations(int index, StringBuilder s, List<String> ans) {

		if (index == s.length()) {
			ans.add(s.toString());
			return;
		}

		for (int i = index; i < s.length(); i++) {
			swap(s, index, i);
			recursivePermutations(index + 1, s, ans);
			swap(s, index, i);
		}
	}

	static void swap(StringBuilder s, int i, int j) {
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		List<String> ans = new ArrayList<String>();
		StringBuilder sb = new StringBuilder(str);

		recursivePermutations(0, sb, ans);

		Collections.sort(ans);

		for (String x : ans)
			System.out.print(x + " ");
	}
}
