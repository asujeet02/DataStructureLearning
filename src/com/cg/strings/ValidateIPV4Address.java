package com.cg.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ValidateIPV4Address {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an IP address");
		String str = sc.nextLine();

		int n = str.length();

		if (n < 7) {
			System.out.println(str + " is not a valid IPV4 address");
			return;
		}

		StringTokenizer strToken = new StringTokenizer(str, ".");
		int count = 0;
		while (strToken.hasMoreTokens()) {
			String subStr = strToken.nextToken();
			count++;

			if (subStr.charAt(0) == '0' && subStr.length() > 1) {
				System.out.println(str + " is not a valid IPV4 address");
				return;
			}

			for (int j = 0; j < subStr.length(); j++)
				if (!Character.isDigit(subStr.charAt(j))) {
					System.out.println(str + " is not a valid IPV4 address");
					return;
				}

			if (Integer.parseInt(subStr) > 255) {
				System.out.println(str + " is not a valid IPV4 address");
				return;
			}
		}

		if (count != 4) {
			System.out.println(str + " is not a valid IPV4 address");
			return;
		}

		System.out.println(str + " is a valid IPV4 address");
	}

}
