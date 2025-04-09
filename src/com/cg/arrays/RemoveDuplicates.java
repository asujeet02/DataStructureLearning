package com.cg.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicates {

	static int removeDuplicatesFromArray(int arr[]) {
		HashSet<Integer> newSet = new HashSet<Integer>();
		int n = arr.length;
		int index = 0;

		for (int i = 0; i < n; i++) {
			if (!newSet.contains(arr[i])) {
				newSet.add(arr[i]);
				arr[index++] = arr[i];
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int i = 0;
		int[] newArray = { 12, 34, 54, 12, 43, 43, 34, 56, 23 };
		int arrayLength = removeDuplicatesFromArray(newArray);
		while (i != arrayLength) {
			System.out.print(newArray[i] + " ");
			i++;
		}
	}
}
