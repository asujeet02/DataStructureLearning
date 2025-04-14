package com.cg.sortingalgorithm;

public class MergeSort {

	static void merge(int[] arrayToBeMerged, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arrayToBeMerged[l + i];

		for (int j = 0; j < n2; ++j)
			R[j] = arrayToBeMerged[m + 1 + j];

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arrayToBeMerged[k] = L[i];
				i++;
			} else {
				arrayToBeMerged[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arrayToBeMerged[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arrayToBeMerged[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Sorted array is");
		sort(arr, 0, arr.length - 1);
		for (int x : arr)
			System.out.print(x + " ");
	}

}
