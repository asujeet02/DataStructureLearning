package com.cg.sortingalgorithm;

public class QuickSort {

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}
	}

	public static void main(String[] args) {

		int[] arrayToBeSorted = { 10, 7, 8, 9, 1, 5 };
		int n = arrayToBeSorted.length;
		quickSort(arrayToBeSorted, 0, n - 1);

		for (int x : arrayToBeSorted)
			System.out.print(x + " ");
	}

}
