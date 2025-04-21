package com.cg.sortingalgorithm;

import java.util.Scanner;

public class MaxSumSlidingWindowTechnique {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the window size!");
		int k = sc.nextInt();
		if (arr.length <= k)
			return;
		int maxSum = 0;
		for (int i = 0; i < k; i++)
			maxSum += arr[i];
		int windowSum = maxSum;
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
		System.out.println("The maximum sum for current window is: " + maxSum);
	}
}
