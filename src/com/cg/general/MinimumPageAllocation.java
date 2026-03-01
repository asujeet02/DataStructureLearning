package com.cg.general;

import java.util.Arrays;

public class MinimumPageAllocation {

	static boolean check(int[] arr, int k, int pageLimit) {
		int count = 1;
		int pageSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (pageSum + arr[i] > pageLimit) {
				count++;
				pageSum = arr[i];
			} else {
				pageSum += arr[i];
			}
		}

		return (count <= k);
	}

	static int findPages(int[] arr, int k) {
		if (k > arr.length)
			return -1;

		int minPageLimits = Arrays.stream(arr).max().getAsInt();
		int maxPageLimits = Arrays.stream(arr).sum();

		for (int i = minPageLimits; i <= maxPageLimits; i++) {
			if (check(arr, k, i))
				return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 67, 90 };
		int k = 2;
		System.out.println(findPages(arr, k));
	}
}
