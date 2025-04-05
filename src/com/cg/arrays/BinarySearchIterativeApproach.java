package com.cg.arrays;

import java.util.Scanner;

public class BinarySearchIterativeApproach {

	public static void main(String[] args) {
		int array[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		int n = array.length;
		int low = 0, high = n - 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be searched: ");
		int x = sc.nextInt();

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == x) {
				System.out.println("The value found at index: " + mid);
				return;
			} else if (x > array[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		System.out.println("Element not found!");
	}
}
