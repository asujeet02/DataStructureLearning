package com.cg.strings;

import java.util.ArrayList;
import java.util.List;

public class SubstringsFromGivenStrings {

	static void subString(String s, int n, int index, StringBuilder curr, List<String> res) {
		if (index == n)
			return;

		curr.append(s.charAt(index));

		res.add(curr.toString());
		subString(s, n, index + 1, curr, res);

		curr.deleteCharAt(curr.length() - 1);

		if (curr.length() == 0)
			subString(s, n, index + 1, curr, res);
	}

	public static void main(String[] args) {
		String s = "abc";

		StringBuilder curr = new StringBuilder();

		List<String> res = new ArrayList<String>();

		subString(s, s.length(), 0, curr, res);

		for (String str : res)
			System.out.print(str + " ");
	}

}
