package com.cg.hashingprob;

import java.util.Arrays;

public class SortingUsingHash {

	public static void main(String[] args) {
		int[] arr = { 9, 4, 3, 2, 5, 2, 1, 0, 4, 3, 5, 10, 15, 12, 18, 20, 19 };
		int n = arr.length;

		int max = Arrays.stream(arr).max().getAsInt();

		int hash[] = new int[max + 1];

		for (int i = 0; i < n; i++)
			hash[arr[i]] += 1;

		for (int i = 0; i <= max; i++)
			if (hash[i] != 0)
				for (int j = 0; j < hash[i]; j++)
					System.out.print(i + " ");
	}

}