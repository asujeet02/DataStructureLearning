package com.cg.arrays;

import java.util.Arrays;

class OnePassSearch {

	public int findSecondLargest(int[] arr) {
		int largest = -1, secondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > secondLargest)
				secondLargest = arr[i];
		}

		return secondLargest;
	}
}

public class SecondLargest {
	public static void main(String[] args) {
		int[] array = { 12, 35, 1, 10, 34, 1 };
		OnePassSearch onePassSearch = new OnePassSearch();

		int secondLargest = onePassSearch.findSecondLargest(array);
		System.out.println(secondLargest);
		/*
		 * int n = array.length; Arrays.sort(array); for (int i = n - 2; i >= 0; i--) {
		 * if (array[i] != array[n - 1]) {
		 * System.out.println("Second largest element is: " + array[i]); break; } if (i
		 * == 0 && (array[i] == array[n - 1])) { System.out.println("-1"); break; } }
		 */
	}
}
