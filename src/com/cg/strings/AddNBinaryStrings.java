package com.cg.strings;

public class AddNBinaryStrings {

	static String trimLeadingZeros(String s) {
		int firstOne = s.indexOf('1');
		return (firstOne == -1) ? "0" : s.substring(firstOne);
	}

	static String addTwoBinary(String s1, String s2) {
		s1 = trimLeadingZeros(s1);
		s2 = trimLeadingZeros(s2);

		int n = s1.length();
		int m = s2.length();

		if (n < m)
			return addTwoBinary(s2, s1);

		int j = m - 1;
		int carry = 0;

		StringBuilder sb = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			int bit1 = s1.charAt(i) - '0';
			int sum = bit1 + carry;

			if (j >= 0) {
				int bit2 = s2.charAt(j) - '0';
				sum += bit2;
				j--;
			}

			int bit = sum % 2;
			carry = sum / 2;

			sb.append((char) (bit + '0'));
		}

		if (carry > 0)
			sb.append('1');

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String arr[] = { "1", "10", "11" };
		String res = "0";

		for (int i = 0; i < arr.length; i++)
			res = addTwoBinary(res, arr[i]);

		System.out.println(res);
	}
}
