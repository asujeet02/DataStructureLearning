package com.cg.strings;

public class RemoveDuplicates {

	static void removeAdjacentDuplicates(StringBuilder str, int n) {

		int k = 0;

		for (int i = 0; i < n; i++) {
			if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
					i++;
			} else
				str.setCharAt(k++, str.charAt(i));
		}

		str.setLength(k);

		if (k != n)
			removeAdjacentDuplicates(str, k);
	}

	public static void main(String[] args) {
		String s = "geeksforgeeks";

		StringBuilder str = new StringBuilder(s);
		removeAdjacentDuplicates(str, str.length());

		System.out.println(str.toString());
	}
}
