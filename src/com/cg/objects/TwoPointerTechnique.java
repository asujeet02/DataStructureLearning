package com.cg.objects;

import java.util.Scanner;

public class TwoPointerTechnique {

	public static void main(String[] args) {
		int arr[] = { 0, -1, 1, 2, -3, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a target value");
		int target = sc.nextInt();

		int l = 0, r = arr.length - 1;

		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum == target) {
				System.out.println("The pair of sum is: " + arr[l] + " and " + arr[r]);
				return;
			} else if (sum < target)
				l++;
			else
				r--;
		}
		System.out.println("No pair of the sum present");
	}

}
