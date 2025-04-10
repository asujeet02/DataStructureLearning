package com.cg.sortingalgorithm;

public class LomutosAlgorithm {

	public static void main(String[] args) {
		int[] arrayToBePartitioned = { 5, 13, 6, 9, 12, 11, 8 };
		int n = arrayToBePartitioned.length;
		int pivot = arrayToBePartitioned[n - 1];
		int i = -1;
		for (int j = 0; j < n; j++) {
			if (arrayToBePartitioned[j] < pivot) {
				i++;
				int temp = arrayToBePartitioned[i];
				arrayToBePartitioned[i] = arrayToBePartitioned[j];
				arrayToBePartitioned[j] = temp;
			}
		}

		int temp = arrayToBePartitioned[i + 1];
		arrayToBePartitioned[i + 1] = arrayToBePartitioned[n - 1];
		arrayToBePartitioned[n - 1] = temp;

		for (int x : arrayToBePartitioned)
			System.out.print(x + " ");
	}
}
