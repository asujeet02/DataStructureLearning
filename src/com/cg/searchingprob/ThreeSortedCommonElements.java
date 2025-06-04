package com.cg.searchingprob;

import java.util.ArrayList;
import java.util.List;

public class ThreeSortedCommonElements {

	public static void main(String[] args) {
		List<Integer> common = new ArrayList<Integer>();
		int arr1[] = { 1, 5, 10, 20, 30 };
		int arr2[] = { 5, 13, 15, 20 };
		int arr3[] = { 5, 20 };

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				common.add(arr1[i]);
				i++;
				j++;
				k++;

				while (i < arr1.length && arr1[i] == arr1[i - 1])
					i++;
				while (j < arr2.length && arr2[j] == arr2[j - 1])
					j++;
				while (k < arr3.length && arr3[k] == arr3[k - 1])
					k++;
			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}

		System.out.println(common.toString());
	}

}
