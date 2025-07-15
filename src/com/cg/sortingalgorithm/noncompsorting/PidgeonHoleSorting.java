package com.cg.sortingalgorithm.noncompsorting;

import java.util.Arrays;

public class PidgeonHoleSorting {

	public static void main(String[] args) {
		int[] arr = { 8, 3, 2, 7, 4, 6, 8 };
		int n = arr.length;
		int min = 0, max = arr[0];

		int range, i, j, index;
		for (int a = 0; a < n; a++) {
			if (arr[a] > max)
				max = arr[a];
			if (arr[a] < min)
				min = arr[a];
		}
		range = max - min + 1;
		int[] phole = new int[range];
		Arrays.fill(phole, 0);

		for (i = 0; i < n; i++)
			phole[arr[i] - min]++;

		index = 0;
		System.out.println("Sorted order is:");
		for (j = 0; j < range; j++)
			while (phole[j]-- > 0) {
				arr[index++] = j + min;
				System.out.print(j + min + " ");
			}
	}

}
