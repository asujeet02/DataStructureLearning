package com.cg.sortingalgorithm;

public class HoaresAlgorithm {
	public static void main(String[] args) {
		int[] arrayToBeSorted = { 5, 3, 8, 4, 2, 7, 1, 10 };
		int n = arrayToBeSorted.length;
		int i = -1, j = n - 1;
		int pivot = arrayToBeSorted[0];
		
		while (true) {
			do {
				i++;
			} while (arrayToBeSorted[i] < pivot);

			do {
				j--;
			} while (arrayToBeSorted[j] > pivot);

			if (i > j)
				break;

			int temp = arrayToBeSorted[i];
			arrayToBeSorted[i] = arrayToBeSorted[j];
			arrayToBeSorted[j] = temp;
		}

		for (int x : arrayToBeSorted)
			System.out.print(x + " ");
	}

}
