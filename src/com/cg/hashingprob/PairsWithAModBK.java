package com.cg.hashingprob;

import java.util.HashMap;
import java.util.Vector;

public class PairsWithAModBK {

	static Vector<Integer> findDivisors(int n) {
		Vector<Integer> v = new Vector<Integer>();

		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				if (n % i == i)
					v.add(i);
				else {
					v.add(i);
					v.add(n / i);
				}

		}
		return v;
	}

	static boolean printPairs(int[] arr, int n, int k) {
		HashMap<Integer, Boolean> occ = new HashMap<>();

		for (int x : arr)
			occ.put(x, true);

		boolean isPairFound = false;

		for (int i = 0; i < n; i++) {
			if (occ.get(k) && arr[i] > k) {
				System.out.println("(" + k + ", " + arr[i] + ")");
				isPairFound = true;
			}

			if (arr[i] >= k) {
				Vector<Integer> v = findDivisors(arr[i] - k);

				for (int j = 0; j < v.size(); j++) {
					if (arr[i] % v.get(j) == k && arr[i] != v.get(j) && occ.get(v.get(j))) {
						System.out.println("(" + arr[i] + ", " + v.get(j) + ")");
						isPairFound = true;
					}
				}

				v.clear();
			}
		}

		return isPairFound;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 5, 4 };
		int k = 2;

		if (printPairs(arr, arr.length, k) == false)
			System.out.println("No such pair exists.");
	}
}
