package com.cg.numberproblems;

import java.util.Scanner;

public class EulersTotientFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find Euler's count !");
		int n = sc.nextInt();

		float result = n;
		for (int p = 2; p * p <= n; ++p) {
			if (n % p == 0) {
				while (n % p == 0)
					n /= p;
				result *= (1.0 - (1.0 / (float) p));
			}
		}

		if (n > 1) {
			result -= result / n;
		}

		System.out.println("phi(" + n + ") = " + (int) result);

	}

}
