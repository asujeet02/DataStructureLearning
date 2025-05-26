package com.cg.searchingprob;

public class MissingNumbersProblem {

	public static void main(String[] args) {
		int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
		int n = arr.length + 1;

		int[] hash = new int[n];

		for (int i = 0; i < n-1; i++) {
			hash[arr[i]-1]++;
		}

		for (int i = 0; i < n-1; i++) {
			if (hash[i] == 0) {
				System.out.println(i+1);
				return;
			}
		}

		System.out.println(-1);
	}

}
