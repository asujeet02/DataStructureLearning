package com.cg.hashingprob;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 2, 12, -2, -20 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum of the subarray to be found!");
		int sum = sc.nextInt();

		int n = arr.length;
		int currSum = 0;

		int start = 0;
		int end = -1;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			currSum += arr[i];
			if (currSum - sum == 0) {
				start = 0;
				end = i;
				break;
			}

			if (hashMap.containsKey(currSum - sum)) {
				start = hashMap.get(currSum - sum) + 1;
				end = i;
				break;
			}

			hashMap.put(currSum, i);
		}

		if (end == -1) {
			System.out.println("No subarray with given sum exists");
		} else
			System.out.println("Sum found between indexes: " + start + " and " + end);
	}
}
