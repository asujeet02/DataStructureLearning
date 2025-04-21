package com.cg.interface1;

import java.util.HashSet;
import java.util.Scanner;

public class TwoSumHashSet {

	public static void main(String[] args) {
		int arr[] = { 0, -1, 1, 2, -3, 1 };

		HashSet<Integer> set = new HashSet<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any target!");

		int target = sc.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			int complement = target - arr[i];
			if (set.contains(complement)) {
				System.out.println("The matching pairs for target are: " + arr[i] + " and " + complement);
				return;
			}
			set.add(arr[i]);
		}
		System.out.println("No target pairs found!");
	}
}
