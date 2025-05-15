package com.cg.numberproblems;

import java.util.Scanner;

public class EulersTotientFunctionExpectedApproach {

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Euler's count !");
		int n = sc.nextInt();

		int result = 1;
		for (int i = 2; i < n; i++) {
			if (gcd(n, i) == 1)
				result++;
		}

		System.out.println("phi(" + n + ") = " + result);
	}

}
