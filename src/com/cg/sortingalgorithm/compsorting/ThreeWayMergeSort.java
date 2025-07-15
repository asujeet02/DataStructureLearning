package com.cg.sortingalgorithm.compsorting;

public class ThreeWayMergeSort {

	static void merge(int arr[], int left, int mid1, int mid2, int right) {
		int size1 = mid1 - left + 1;
		int size2 = mid2 - mid1;
		int size3 = right - mid2;

		int[] leftArray = new int[size1];
		int[] midArray = new int[size2];
		int[] rightArray = new int[size3];

		for (int i = 0; i < size1; i++)
			leftArray[i] = arr[left + i];
		for (int i = 0; i < size2; i++)
			midArray[i] = arr[mid1 + 1 + i];
		for (int i = 0; i < size3; i++)
			rightArray[i] = arr[mid2 + 1 + i];

		int i = 0, j = 0, k = 0, index = left;
		while (i < size1 || j < size2 || k < size3) {
			int minValue = Integer.MAX_VALUE, minIdx = -1;

			if (i < size1 && leftArray[i] < minValue) {
				minValue = leftArray[i];
				minIdx = 0;
			}

			if (j < size2 && midArray[j] < minValue) {
				minValue = midArray[j];
				minIdx = 1;
			}

			if (k < size3 && rightArray[k] < minValue) {
				minValue = rightArray[k];
				minIdx = 2;
			}

			if (minIdx == 0)
				arr[index++] = leftArray[i++];
			else if (minIdx == 1)
				arr[index++] = midArray[j++];
			else
				arr[index++] = rightArray[k++];
		}
	}

	static void threeWayMergeSort(int arr[], int left, int right) {
		if (left >= right)
			return;
		int mid1 = left + (right - left) / 3;
		int mid2 = left + 2 * (right - left) / 3;

		threeWayMergeSort(arr, left, mid1);
		threeWayMergeSort(arr, mid1 + 1, mid2);
		threeWayMergeSort(arr, mid2 + 1, right);

		merge(arr, left, mid1, mid2, right);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 6, 3, 8, 4, 7 };
		int n = arr.length;
		threeWayMergeSort(arr, 0, n - 1);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
