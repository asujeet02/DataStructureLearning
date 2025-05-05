package com.cg.numberproblems;

import java.util.Scanner;

public class CombinationsNpr {

	public static double multiplier(int start, int end) {
		if (start == end)
			return start;
		double res = 1;
		while (start <= end) {
			res *= start;
			start++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		System.out.println("Enter the value of r:");
		int r = sc.nextInt();
		if (n < r) {
			System.out.println("There are no possible combinations");
			return;
		}
		if (n == r || r == 0) {
			System.out.println("There is only one possible combinations");
			return;
		}

		int maxVal = Math.max(r, n - r);
		int minVal = Math.min(r, n - r);

		double num = multiplier(maxVal + 1, n);
		double den = multiplier(1, minVal);

		System.out.println("There are " + (num / den) + " possible combinations");
	}

}
