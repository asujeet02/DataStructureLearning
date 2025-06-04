package com.cg.searchingprob;

import java.util.Scanner;

public class KthSmallestInAMatrix {
	static int countSmallerEqual(int[][] matrix, int k) {
		int n = matrix.length;
		int count = 0;
		int row = 0;
		int col = n - 1;

		while (row < n && col >= 0) {
			if (matrix[row][col] <= k) {
				count += (col + 1);
				row++;
			} else {
				col--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 24, 29, 37, 48 }, { 32, 33, 39, 50 } };
		System.out.println("Enter the value of K");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int n = matrix.length;
		int low = matrix[0][0];
		int high = matrix[n - 1][n - 1];
		int ans = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			int count = countSmallerEqual(matrix, mid);

			if (count < k)
				low = mid + 1;
			else {
				ans = mid;
				high = mid - 1;
			}
		}

		System.out.println("The kth smallest element is " + ans);
	}
}
