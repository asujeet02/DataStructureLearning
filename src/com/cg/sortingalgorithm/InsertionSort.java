package com.cg.sortingalgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arrayToBeSorted = { 12, 11, 13, 5, 6 };
		int n = arrayToBeSorted.length;
		for (int i = 1; i < n; i++) {
			int key = arrayToBeSorted[i];
			int j = i - 1;

			while (j >= 0 && arrayToBeSorted[j] > key) {
				arrayToBeSorted[j + 1] = arrayToBeSorted[j];
				j = j - 1;
			}
			arrayToBeSorted[j + 1] = key;
		}

		for (int x : arrayToBeSorted)
			System.out.print(x + " ");
	}
}
