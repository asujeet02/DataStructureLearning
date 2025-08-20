package com.cg.hashingprob;

public class MaxDifferenceTwoSubsetArrays {

	public static void main(String[] args) {
		int subsetSum1 = 0, subsetSum2 = 0;

		int[] arr = { 4, 2, -3, 3, -2, -2, 8 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isSingleOccurence = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = arr[j] = 0;
					isSingleOccurence = false;
					break;
				}
			}

			if (isSingleOccurence) {
				if (arr[i] > 0)
					subsetSum1 += arr[i];
				else
					subsetSum2 += arr[i];
			}
		}

		System.out.println(Math.abs(subsetSum1 - subsetSum2));
	}

}
