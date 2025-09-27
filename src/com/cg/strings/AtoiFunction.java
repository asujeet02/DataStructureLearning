package com.cg.strings;

import java.util.Scanner;

public class AtoiFunction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to convert");
		String str = sc.nextLine();

		int index = 0, sign = 1, res = 0;

		while (index < str.length() && str.charAt(index) == ' ') {
			index++;
		}

		if (index < str.length() && str.charAt(index) == '-' || str.charAt(index) == '+')
			if (str.charAt(index++) == '-')
				sign = -1;

		while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(index) - '0' > 7)) {
				System.out.println(sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
				return;
			}

			res = 10 * res + (str.charAt(index++) - '0');
		}

		System.out.println(res * sign);

	}

}
