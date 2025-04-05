package com.cg.sortingalgorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 6, 0, 5, 4, 8, 7 };
		int n = array.length;

		for (int i = 0; i < n; i++) {
			int min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min_index])
					min_index = j;
			}

			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
		}

		for (int x : array)
			System.out.print(x + " ");
	}

}
