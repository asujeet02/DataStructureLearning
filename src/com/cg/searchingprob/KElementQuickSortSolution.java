package com.cg.searchingprob;

import java.util.ArrayList;
import java.util.Collections;

public class KElementQuickSortSolution {

	static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left;

		for (int j = left; j < right; j++) {
			if (arr[j] >= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[right];
		arr[right] = temp;
		return i;
	}

	static void quickSelect(int[] arr, int left, int right, int k) {
		if (left <= right) {
			int pivotIndex = partition(arr, left, right);
			int leftCount = pivotIndex - left + 1;

			if (leftCount == k)
				return;

			if (leftCount > k)
				quickSelect(arr, left, pivotIndex - 1, k);
			else
				quickSelect(arr, pivotIndex + 1, right, k - leftCount);
		}
	}

	static ArrayList<Integer> kLargest(int[] arr, int k) {
		quickSelect(arr, 0, arr.length - 1, k);
		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < k; i++) {
			res.add(arr[i]);
		}

		Collections.sort(res, Collections.reverseOrder());
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;
		ArrayList<Integer> res = kLargest(arr, k);
		for (int ele : res)
			System.out.print(ele + " ");
	}
}
