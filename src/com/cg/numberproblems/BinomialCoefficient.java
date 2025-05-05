package com.cg.numberproblems;

public class BinomialCoefficient {

	static int BinoCoefficient(int n, int k) {
		if (k > n)
			return 0;
		if (k == n || k == 0)
			return 1;
		return BinoCoefficient(n - 1, k - 1) + BinoCoefficient(n - 1, k);
	}

	public static void main(String[] args) {
		int n = 5, k = 2;
		System.out.println(BinoCoefficient(n, k));
	}
}
