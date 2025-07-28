package com.cg.hashingprob;

import java.util.Arrays;
import java.util.Scanner;

public class PairsWithKDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 4, 1, 4, 5 };
		System.out.println("Enter the value of k: ");
		int k = sc.nextInt();

		int n = arr.length;
		int count = 0;
		Arrays.sort(arr);

		int i = 0, j = 0;

		while (j < n) {
			if (arr[j] - arr[i] < k)
				j++;
			else if (arr[j] - arr[i] > k)
				i++;

			else {
				int ele1 = arr[i], ele2 = arr[j];
				int cnt1 = 0, cnt2 = 0;
				while (j < n && arr[j] == ele2) {
					j++;
					cnt2++;
				}

				while (i < n && arr[i] == ele1) {
					i++;
					cnt1++;
				}

				if (ele1 == ele2) {
					count += (cnt1 * (cnt1 - 1)) / 2;
				} else
					count += cnt1 * cnt2;
			}

		}
		System.out.println("The total number of pairs: " + count);
	}

}
