package com.cg.arrays;

import java.util.Scanner;

public class MinOpsToMakeArrayEqual {

	public static void main(String[] args) {
		int[] array = {4, 2, 6, 8};
		int res = 0;
		int n = array.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of K: ");
		int k = sc.nextInt();
		int i = 0;
		int max = Integer.MIN_VALUE;

		while (i != n) {
			max = Math.max(max, array[i]);
			i++;
		}

		for (int j = 0; j < n; j++) {
			if ((max - array[j]) % k != 0) {
				System.out.println("Elements cannot be made equal!");
				return;
			} else {
				res += (max - array[j]) / k;
			}
		}
		System.out.println("The minimum operation needed to make the array equal is:" + res);

	}
}
