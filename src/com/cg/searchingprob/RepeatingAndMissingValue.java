package com.cg.searchingprob;

public class RepeatingAndMissingValue {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 3 };
		int n = arr.length;

		int repeating = -1, missing = -1;

		for (int i = 0; i < n; i++) {
			int val = Math.abs(arr[i]);
			if (arr[val - 1] > 0)
				arr[val - 1] = -arr[val - 1];
			else
				repeating = val;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				missing = i + 1;
		}

		System.out.println("Repeating number: " + repeating + " Missing number: " + missing);
	}
}
