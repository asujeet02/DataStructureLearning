package com.cg.objects;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumBinarySearch {

	static boolean binarySearch(int arr[], int l, int h, int target) {
		while (l < h) {
			int mid = l + (h - l) / 2;
			if (arr[mid] == target)
				return true;
			if (arr[mid] < target)
				l = mid + 1;
			else
				h = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 0, -1, 1, 2, -3, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a target value");
		int target = sc.nextInt();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (binarySearch(arr, i + 1, arr.length - 1, complement)) {
				System.out.println("The sum pairs are: " + arr[i] + " and " + complement);
				return;
			}
		}
		System.out.println("No pair found for the target!");
	}
}
