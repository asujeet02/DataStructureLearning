package com.cg.numberproblems;

public class CatalanNumber {

	static int findCatalan(int n) {
		if (n <= 1)
			return 1;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += findCatalan(i) * findCatalan(n - i - 1);
		}
		return res;
	}

	static int findCatalanArray(int n) {
		int catalan[] = new int[n + 1];

		catalan[0] = catalan[1] = 1;

		for (int i = 2; i <= n; i++) {
			catalan[i] = 0;
			for (int j = 0; j < i; j++) {
				catalan[i]+= catalan[j] * catalan[i - j - 1];
			}
		}
		return catalan[n];
	}

	public static void main(String[] args) {
		int n = 6;
		int res = findCatalanArray(n);
		System.out.println(res);
	}
}
